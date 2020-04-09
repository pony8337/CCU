#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import pandas as pd
import numpy as np
import math
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split



# get the function weight  W = (X^T X)^-1 X^T y 
def regression(x_nd, y_1d):
    return np.dot(np.dot(np.linalg.inv(np.dot(x_nd.T, x_nd)), x_nd.T), y_1d)

# get the function weight W = (X^T X + λI)^-1 X^T y
def regularization(x_nd, y_1d, Lambda, dim):
    return np.dot(np.dot(np.linalg.inv((np.dot(x_nd.T, x_nd) + Lambda*np.eye(dim))), x_nd.T), y_1d)
    
# testing error
def trainingError(x, y, degree):
    error = 0
    dim = degree+1
    num = y.size  # data number
    x_nd = np.zeros((num, dim))
    for i in range(num):
        for j in range(dim):
            x_nd[i][j] = pow(x[i], j)
    global weight
    weight = regression(x_nd, y)
    
    # Ein(w) = 1/N * |Xw-y|^2 
    for i in range(num):
        error += math.pow((np.dot(x_nd[i].T, weight) - y[i]), 2)
    error /= num
    return error

# leave one out
def leaveOneOut(x, y, degree):
    error = 0
    dim = degree+1
    num = y.size    
    x_nd = np.zeros((num-1, dim))
    train_y = np.zeros(num-1)
    
    for i in range(num):
        k = 0
        for j in range(num):
            if i == j:
                test_x = x[j]
                test_y = y[j]
                continue
            else:
                for l in range(dim):
                    x_nd[k][l] = pow(x[j], l)
                train_y[k] = y[j]
                k=k+1
            #end of for loop
        w = regression(x_nd, train_y)
        y_prediction = 0
        for k in range(dim):
            y_prediction += w[k] * pow(test_x, k)
        error += math.pow((y_prediction - test_y), 2)
        #end of for loop    
    error /= num
    return error

# five-fold
def fiveFold(x, y, degree):
    error = 0
    dim = degree + 1
    num = y.size
    groupNum = 5
    testNum = int(num / groupNum)
    trainNum = num - testNum
    test_x = np.zeros(testNum)
    test_y = np.zeros(testNum)
    x_nd = np.zeros((trainNum, dim))
    train_y = np.zeros(trainNum)
    # split in 5 group
    for i in range(groupNum):
        k = 0
        l = 0
        for j in range(num):
            if j % groupNum == i:
                test_x[k] = x[j]
                test_y[k] = y[j]
                k = k + 1
            else:
                for m in range(dim):
                    x_nd[l][m] = pow(x[j], m)
                train_y[l] = y[j]
                l = l + 1
            #end of for loop
        w = regression(x_nd, train_y)
        for k in range(testNum):
            y_prediction = 0
            for l in range(dim):
                y_prediction += w[l] * pow(test_x[k], l)
            error += math.pow((y_prediction - test_y[k]), 2)
        #end of for loop
    error /= num
    return error    
    
# testing error (Just only input test data)
def testingError(x, y, w, degree):
    num = y.size
    dim = degree + 1
    error = 0
    for i in range(num):
        y_prediction = 0
        for j in range(dim):
            y_prediction += w[j]*pow(x[i], j)
        error += math.pow((y_prediction - y[i]), 2)
    error /= num
    return error

def trainingError_14d_regularization(x, y, Lambda):
    error = 0
    dim = 15
    num = y.size  # data number
    x_nd = np.zeros((num, dim))
    for i in range(num):
        for j in range(dim):
            x_nd[i][j] = pow(x[i], j)
    global weight
    weight = regularization(x_nd, y, Lambda, dim)
    # error
    for i in range(num):
        error += math.pow((np.dot(x_nd[i].T, weight) - y[i]), 2) + Lambda * np.dot(weight.T, weight)
        
    error /= num
    return error

def leaveOneOut_14d_regularization(x, y, Lambda):
    error = 0
    dim = 15
    num = y.size    
    x_nd = np.zeros((num-1, dim))
    train_y = np.zeros(num-1)
    
    for i in range(num):
        k = 0
        for j in range(num):
            if i == j:
                test_x = x[j]
                test_y = y[j]
                continue
            else:
                for l in range(dim):
                    x_nd[k][l] = pow(x[j], l)
                train_y[k] = y[j]
                k=k+1
            #end of for loop
        w = regularization(x_nd, train_y, Lambda, dim)
        y_prediction = 0
        for k in range(dim):
            y_prediction += w[k] * pow(test_x, k)
        error += (math.pow((y_prediction - test_y), 2) + Lambda * np.dot(w.T, w))
        #end of for loop    
    error /= num
    return error

def fiveFold_14d_regularization(x, y, Lambda):
    error = 0
    dim = 15
    num = y.size
    groupNum = 5
    testNum = int(num / groupNum)
    trainNum = num - testNum
    test_x = np.zeros(testNum)
    test_y = np.zeros(testNum)
    x_nd = np.zeros((trainNum, dim))
    train_y = np.zeros(trainNum)
    # split in 5 group
    for i in range(groupNum):
        k = 0
        l = 0
        for j in range(num):
            if j % groupNum == i:
                test_x[k] = x[j]
                test_y[k] = y[j]
                k = k + 1
            else:
                for m in range(dim):
                    x_nd[l][m] = pow(x[j], m)
                train_y[l] = y[j]
                l = l + 1
            #end of for loop
        w = regularization(x_nd, train_y, Lambda, dim)
        # error
        for k in range(testNum):
            y_prediction = 0
            for l in range(dim):
                y_prediction += w[l] * pow(test_x[k], l)
            error += (math.pow((y_prediction - test_y[k]), 2) + Lambda * np.dot(w.T, w))
        #end of for loop
    error /= num
    return error
    
# testing error (Just only input test data)
def testingError_14d_regularization(x, y, w, Lambda):
    num = y.size
    dim = 15
    error = 0
#     w_norm = 0
#     for i in range(w.size):
#         w_norm += abs(w[i])
    for i in range(num):
        y_prediction = 0
        for j in range(dim):
            y_prediction += w[j]*pow(x[i], j)
        error += (math.pow((y_prediction - y[i]), 2) + Lambda * np.dot(w.T, w))
    error /= num
    return error
    
def singlePlot(point_x, point_y, range_x, w, lim_x, lim_y):
    dim = w.size
    plt.xlim(lim_x)
    plt.ylim(lim_y)
    plt.title("single plot (degree %d)" %(dim-1))
    plt.scatter(point_x, point_y, c = 'r', alpha=0.6)
    paint_y = 0
    for i in range(dim):
        paint_y += w[i]*(range_x**i)
    plt.plot(range_x, paint_y)
    plt.show()

    

def integrationMap(point_x, point_y, range_x, w_1d, w_5d, w_10d, w_14d, lim_x, lim_y):
    plt.title("Integration map")
    plt.xlim(lim_x)
    plt.ylim(lim_y)
    
    plt.scatter(point_x, point_y, c = 'r', alpha=0.6)
    paint_y = w_1d[1]*range_x + w_1d[0]
    plt.plot(range_x, paint_y)

    paint_y = 0
    for i in range(6):
        paint_y += w_5d[i]*(range_x**i)
    plt.plot(range_x, paint_y)

    paint_y = 0
    for i in range(11):
        paint_y += w_10d[i]*(range_x**i)
    plt.plot(range_x, paint_y)

    paint_y = 0
    for i in range(15):
        paint_y += w_14d[i]*(range_x**i)
    plt.plot(range_x, paint_y)
    plt.show()

def integrationMap_14d(point_x, point_y, range_x, Lambda1, Lambda2, Lambda3, Lambda4, lim_x, lim_y):
    plt.title("Integration map")
    plt.xlim(lim_x)
    plt.ylim(lim_y)
    
    plt.scatter(point_x, point_y, c = 'r', alpha=0.6)
    
    paint_y = 0
    for i in range(15):
        paint_y += Lambda1[i]*(range_x**i)
    plt.plot(range_x, paint_y)
    
    paint_y = 0
    for i in range(15):
        paint_y += Lambda2[i]*(range_x**i)
    plt.plot(range_x, paint_y)
    
    paint_y = 0
    for i in range(15):
        paint_y += Lambda3[i]*(range_x**i)
    plt.plot(range_x, paint_y)
    
    paint_y = 0
    for i in range(15):
        paint_y += Lambda4[i]*(range_x**i)
    plt.plot(range_x, paint_y)
    
    plt.show()
#******************* FUNCTION *********************#    


# In[ ]:


x = np.linspace(-3, 3, 20)           #  x ∈ [−3, 3]
y = np.zeros(20)           
y = 2*x + np.random.normal(0, 1, 20) #  y = 2x + ε

# (a)
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.25)


degree1_trainingError = trainingError(x_train, y_train, 1)
w_1d = weight
degree1_leaveOneOut = leaveOneOut(x_train, y_train, 1)
degree1_fiveFold = fiveFold(x_train, y_train, 1)
degree1_testingError = testingError(x_test, y_test, w_1d, 1)
print("degree 1:")
print("\ttraining error\n\tEin = ", degree1_trainingError)
print("\n\tcross-validation errors [Leave one out]\n\tEin = ", degree1_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", degree1_fiveFold)
print("\n\ttesting error\n\tEin = ", degree1_testingError)
singlePlot(x_train, y_train, np.arange(-3, 3, 0.01), w_1d, (-3, 3), (-15, 30))

# (b)
# degree = 5
print("\ndegree 5:")
degree5_trainingError = trainingError(x_train, y_train, 5)
w_5d = weight
degree5_leaveOneOut = leaveOneOut(x_train, y_train, 5)
degree5_fiveFold = fiveFold(x_train, y_train, 5)
degree5_testingError = testingError(x_test, y_test, w_5d, 5)

print("\ttraining error\n\tEin = ", degree5_trainingError)
print("\n\tcross-validation errors [Leave one out]\n\tEin = ", degree5_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", degree5_fiveFold)
print("\n\ttesting error\n\tEin = ", degree5_testingError)
singlePlot(x_train, y_train, np.arange(-3, 3, 0.01), w_5d, (-3, 3), (-15, 30))

# degree = 10
print("\ndegree 10:")
degree10_trainingError = trainingError(x_train, y_train, 10)
w_10d = weight
degree10_leaveOneOut = leaveOneOut(x_train, y_train, 10)
degree10_fiveFold = fiveFold(x_train, y_train, 10)
degree10_testingError = testingError(x_test, y_test, w_10d, 10)

print("\ttraining error\n\tEin = ", degree10_trainingError)
print("\n\tcross-validation errors [Leave one out]\n\tEin = ", degree10_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", degree10_fiveFold)
print("\n\ttesting error\n\tEin = ", degree10_testingError)
singlePlot(x_train, y_train, np.arange(-3, 3, 0.01), w_10d, (-3, 3), (-15, 30))

# degree = 14
print("\ndegree 14:")
degree14_trainingError = trainingError(x_train, y_train, 14)
w_14d = weight
degree14_leaveOneOut = leaveOneOut(x_train, y_train, 14)
degree14_fiveFold = fiveFold(x_train, y_train, 14)
degree14_testingError = testingError(x_test, y_test, w_14d, 14)

print("\ttraining error\n\tEin = ", degree14_trainingError)
print("\n\tcross-validation errors [Leave one out]\n\tEin = ", degree14_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", degree14_fiveFold)
print("\n\ttesting error\n\tEin = ", degree14_testingError)
singlePlot(x_train, y_train, np.arange(-3, 3, 0.01), w_14d, (-3, 3), (-15, 30))
print("---------------------------------------------------")
# integration map

print("整合\ny = 2x + ε:\n\n")
integration_data = {'degree':         [1, 5, 10, 14],
                    'Training Error': [degree1_trainingError, degree5_trainingError, degree10_trainingError, degree14_trainingError],
                    'Leave-One-Out':  [degree1_leaveOneOut,   degree5_leaveOneOut,   degree10_leaveOneOut,   degree14_leaveOneOut],
                    'Five-Fold':      [degree1_fiveFold,      degree5_fiveFold,      degree10_fiveFold,      degree14_fiveFold],
                    "Testing Error":  [degree1_testingError,  degree5_testingError,  degree10_testingError,  degree14_testingError]
                   }
df = pd.DataFrame(integration_data)
df.set_index('degree', inplace=True)
print(df)

integrationMap(x_train, y_train, np.arange(-3, 3, 0.01), w_1d, w_5d, w_10d, w_14d, (-3, 3), (-15, 30))


# In[ ]:


#(c)
# y = sin(2πx) + ε with the noise ε∼ N(0, 0.04)

x = np.linspace(0, 1, 20) # x ∈ [0, 1]
y = np.zeros(20)
y = np.sin(2*np.pi*x) + np.random.normal(0, 0.2, 20)  # y = sin(2πx) + ε with ε∼ N(0, 0.04)
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.25)

print("y = sin(2πx) + ε ")
print("Degree = 1:")
degree1_trainingError = trainingError(x_train, y_train, 1)
w_1d = weight
degree1_leaveOneOut = leaveOneOut(x_train, y_train, 1)
degree1_fiveFold = fiveFold(x_train, y_train, 1)
degree1_testingError = testingError(x_test, y_test, w_1d, 1)

print("\ttraining error\n\tEin = ", degree1_trainingError)
# w_1d = weight
print("\n\tcross-validation errors [Leave one out]\n\tEin = ", degree1_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", degree1_fiveFold)
print("\n\ttesting error\n\tEin = ", degree1_testingError)
singlePlot(x_train, y_train, np.arange(0, 1, 0.0001), w_1d, (0, 1), (-1.5, 1.5))

# (b)
# degree = 5
print("Degree = 5:")
degree5_trainingError = trainingError(x_train, y_train, 5)
w_5d = weight
degree5_leaveOneOut = leaveOneOut(x_train, y_train, 5)
degree5_fiveFold = fiveFold(x_train, y_train, 5)
degree5_testingError = testingError(x_test, y_test, w_5d, 5)

print("\ttraining error\n\tEin = ", degree5_trainingError)
# w_5d = weight
print("\n\tcross-validation errors [Leave one out]\n\tEin = ", degree5_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", degree5_fiveFold)
print("\n\ttesting error\n\tEin = ", degree5_testingError)
singlePlot(x_train, y_train, np.arange(0, 1, 0.0001), w_5d, (0, 1), (-1.5, 1.5))

# degree = 10
print("Degree = 10:")
degree10_trainingError = trainingError(x_train, y_train, 10)
w_10d = weight
degree10_leaveOneOut = leaveOneOut(x_train, y_train, 10)
degree10_fiveFold = fiveFold(x_train, y_train, 10)
degree10_testingError = testingError(x_test, y_test, w_10d, 10)

print("\ttraining error\n\tEin = ", degree10_trainingError)
# w_10d = weight
print("\n\tcross-validation errors [Leave one out]\n\tEin = ", degree10_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", degree10_fiveFold)
print("\n\ttesting error\n\tEin = ", degree10_testingError)
singlePlot(x_train, y_train, np.arange(0, 1, 0.0001), w_10d, (0, 1), (-1.5, 1.5))

# degree = 14
print("Degree = 14:")
degree14_trainingError = trainingError(x_train, y_train, 14)
w_14d = weight
degree14_leaveOneOut = leaveOneOut(x_train, y_train, 14)
degree14_fiveFold = fiveFold(x_train, y_train, 14)
degree14_testingError = testingError(x_test, y_test, w_14d, 14)

print("\ttraining error\n\tEin = ", degree14_trainingError)
w_14d = weight
print("\n\tcross-validation errors [Leave one out]\n\tEin = ", degree14_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", degree14_fiveFold)
print("\n\ttesting error\n\tEin = ", degree14_testingError)
singlePlot(x_train, y_train, np.arange(0, 1, 0.0001), w_14d, (0, 1), (-1.5, 1.5))
print("---------------------------------------------------")
# integration 

print("整合\ny = sin(2πx) + ε:\n\n")
integration_data = {'degree':         [1, 5, 10, 14],
                    'Training Error': [degree1_trainingError, degree5_trainingError, degree10_trainingError, degree14_trainingError],
                    'Leave-One-Out':  [degree1_leaveOneOut,   degree5_leaveOneOut,   degree10_leaveOneOut,   degree14_leaveOneOut],
                    'Five-Fold':      [degree1_fiveFold,      degree5_fiveFold,      degree10_fiveFold,      degree14_fiveFold],
                    "Testing Error":  [degree1_testingError,  degree5_testingError,  degree10_testingError,  degree14_testingError]
                   }
df = pd.DataFrame(integration_data)
df.set_index('degree', inplace=True)
print(df)

integrationMap(x_train, y_train, np.arange(0, 1, 0.0001), w_1d, w_5d, w_10d, w_14d, (0, 1), (-1.5, 1.5))


# In[ ]:


# (d)
# m = 60
x = np.linspace(-3, 3, 60)  # x ∈ [−3, 3]
y = np.zeros(60)
y = 2*x + np.random.normal(0, 1, 60)

print("y = 2x + ε")
print("degree = 14")
print("m = 60:")
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.25)

m60_trainingError = trainingError(x_train, y_train, 14)
w_60 = weight
m60_leaveOneOut = leaveOneOut(x_train, y_train, 14)
m60_fiveFold = fiveFold(x_train, y_train, 14)
m60_testingError = testingError(x_test, y_test, w_60, 14)
print("\ttraining error\n\tEin = ", m60_trainingError)
# w_60 = weight
print("\n\tcross-validation errors [Leave one out]\n\tEin = ", m60_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", m60_fiveFold)
print("\n\ttesting error\n\tEin = ", m60_testingError)
singlePlot(x_train, y_train, np.arange(-3, 3, 0.01), w_60, (-3, 3), (-15, 30))

# m = 160
x = np.linspace(-3, 3, 160)  # x ∈ [−3, 3] 
y = np.zeros(160)
y = 2*x + np.random.normal(0, 1, 160)

x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.25)

print("y = 2x + ε")
print("degree = 14")
print("m = 160:")

m160_trainingError = trainingError(x_train, y_train, 14)
w_160 = weight
m160_leaveOneOut = leaveOneOut(x_train, y_train, 14)
m160_fiveFold = fiveFold(x_train, y_train, 14)
m160_testingError = testingError(x_test, y_test, w_160, 14)

print("\ttraining error\n\tEin = ", m160_trainingError)
# w_160 = weight
print("\n\tcross-validation errors [Leave one out]\n\tEin = ", m160_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", m160_fiveFold)
print("\n\ttesting error\n\tEin = ", m160_testingError)
singlePlot(x_train, y_train, np.arange(-3, 3, 0.01), w_160, (-3, 3), (-15, 30))

# m = 320
x = np.linspace(-3, 3, 320)  # x ∈ [−3, 3] 
y = np.zeros(320)
y = 2*x + np.random.normal(0, 1, 320)

x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.25)

print("y = 2x + ε")
print("degree = 14")
print("m = 320:")

m320_trainingError = trainingError(x_train, y_train, 14)
w_320 = weight
m320_leaveOneOut = leaveOneOut(x_train, y_train, 14)
m320_fiveFold = fiveFold(x_train, y_train, 14)
m320_testingError = testingError(x_test, y_test, w_320, 14)

print("\ttraining error\n\tEin = ", m320_trainingError)
# w_320 = weight
print("\n\tcross-validation errors [Leave one out]\n\tEin = ", m320_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", m320_fiveFold)
print("\n\ttesting error\n\tEin = ", m320_testingError)
singlePlot(x_train, y_train, np.arange(-3, 3, 0.01), w_320, (-3, 3), (-15, 30))


print("--------------------------------------------------------")
# integration 

print("整合\ny = 2x + ε (m = 60, m = 160, m = 320):\n\n")
integration_data = {'m':              [60, 160, 320],
                    'Five-Fold':      [m60_fiveFold,  m160_fiveFold,  m320_fiveFold],
                    "Testing Error":  [m60_testingError, m160_testingError, m320_testingError]
                   }
df = pd.DataFrame(integration_data)
df.set_index('m', inplace=True)
print(df)


# In[ ]:


# (e)
# Lambda = 0
m = 20
x = np.linspace(0, 1, m)  # x ∈ [0, 1]
y = np.zeros(m)
y = 2*x + np.random.normal(0, 1, m) # y = 2x + ε
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.25)


print("y = 2x + ε")
Lambda = 0
print("Lambda = 0")
Lambda1_trainingError = trainingError_14d_regularization(x_train, y_train, Lambda)
w_Lambda1 = weight
Lambda1_leaveOneOut = leaveOneOut_14d_regularization(x_train, y_train, Lambda)
Lambda1_fiveFold = fiveFold_14d_regularization(x_train, y_train, Lambda)
Lambda1_testingError = testingError_14d_regularization(x_train, y_train, w_Lambda1, Lambda)

print("\n\ttraining error\n\tEin = ", Lambda1_trainingError)
# w_Lambda1 = weight
print("\n\tcross-validation errors [leave one out]\n\tEin = ", Lambda1_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", Lambda1_fiveFold)
print("\n\ttesting error\n\tEin = ", Lambda1_testingError)
singlePlot(x_train, y_train, np.arange(0, 1, 0.0001), w_Lambda1, (0, 1), (-3, 3))

Lambda = 0.001/m
print("Lambda = 0.001/m")
Lambda2_trainingError = trainingError_14d_regularization(x_train, y_train, Lambda)
w_Lambda2 = weight
Lambda2_leaveOneOut = leaveOneOut_14d_regularization(x_train, y_train, Lambda)
Lambda2_fiveFold = fiveFold_14d_regularization(x_train, y_train, Lambda)
Lambda2_testingError = testingError_14d_regularization(x_train, y_train, w_Lambda2, Lambda)

print("\n\ttraining error\n\tEin = ", Lambda2_trainingError)
# w_Lambda2 = weight
print("\n\tcross-validation errors [leave one out]\n\tEin = ", Lambda2_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", Lambda2_fiveFold)
print("\n\ttesting error\n\tEin = ", Lambda2_testingError)
singlePlot(x_train, y_train, np.arange(0, 1, 0.0001), w_Lambda2, (0, 1), (-3, 3))

Lambda = 1/m
print("Lambda = 1/m")
Lambda3_trainingError = trainingError_14d_regularization(x_train, y_train, Lambda)
w_Lambda3 = weight
Lambda3_leaveOneOut = leaveOneOut_14d_regularization(x_train, y_train, Lambda)
Lambda3_fiveFold = fiveFold_14d_regularization(x_train, y_train, Lambda)
Lambda3_testingError = testingError_14d_regularization(x_train, y_train, w_Lambda3, Lambda)

print("\n\ttraining error\n\tEin = ", Lambda3_trainingError)
# w_Lambda3 = weight
print("\n\tcross-validation errors [leave one out]\n\tEin = ", Lambda3_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", Lambda3_fiveFold)
print("\n\ttesting error\n\tEin = ", Lambda3_testingError)
singlePlot(x_train, y_train, np.arange(0, 1, 0.0001), w_Lambda3, (0, 1), (-3, 3))

Lambda = 1000/m
print("Lambda = 1000/m")
Lambda4_trainingError = trainingError_14d_regularization(x_train, y_train, Lambda)
w_Lambda4 = weight
Lambda4_leaveOneOut = leaveOneOut_14d_regularization(x_train, y_train, Lambda)
Lambda4_fiveFold = fiveFold_14d_regularization(x_train, y_train, Lambda)
Lambda4_testingError = testingError_14d_regularization(x_train, y_train, w_Lambda4, Lambda)

print("\n\ttraining error\n\tEin = ", Lambda4_trainingError)
# w_Lambda4 = weight
print("\n\tcross-validation errors [leave one out]\n\tEin = ", Lambda4_leaveOneOut)
print("\n\tcross-validation errors [five-fold]\n\tEin = ", Lambda4_fiveFold)
print("\n\ttesting error\n\tEin = ", Lambda4_testingError)
singlePlot(x_train, y_train, np.arange(0, 1, 0.0001), w_Lambda4, (0, 1), (-3, 3))
print("---------------------------------------------------")
# integration

print("整合\ny = 2x + ε (regularization), m = 20:\n\n")
integration_data = {'Lambda (λ)':     ['0', '0.001/m', '1/m', '1000/m'],
                    'Training Error': [Lambda1_trainingError, Lambda2_trainingError, Lambda3_trainingError, Lambda4_trainingError],
                    'Leave-One-Out':  [Lambda1_leaveOneOut,   Lambda2_leaveOneOut,   Lambda3_leaveOneOut,   Lambda4_leaveOneOut],
                    'Five-Fold':      [Lambda1_fiveFold,      Lambda2_fiveFold,      Lambda3_fiveFold,      Lambda4_fiveFold],
                    "Testing Error":  [Lambda1_testingError,  Lambda2_testingError,  Lambda3_testingError,  Lambda4_testingError]
                   }
df = pd.DataFrame(integration_data)
df.set_index('Lambda (λ)', inplace=True)
print(df)

integrationMap_14d(x_train, y_train, np.arange(0, 1, 0.001), w_Lambda1, w_Lambda2, w_Lambda3, w_Lambda4, (0, 1), (-3, 3))

