from sklearn import datasets
import matplotlib.pyplot as plt
import seaborn as sns
import pandas as pd
import numpy as np
raw_data = datasets.load_wine()
raw_data
for key,value in raw_data.items():
    print(key,'\n',value,'\n')
print('data.shape\t',raw_data['data'].shape,
      '\ntarget.shape \t',raw_data['target'].shape)
features = pd.DataFrame(data=raw_data['data'],columns=raw_data['feature_names'])
data = features
data['target']=raw_data['target']
data['class']=data['target'].map(lambda ind: raw_data['target_names'][ind])
data.head()
data.describe()
sns.distplot(data['alcohol'],kde=0)
for i in data.target.unique():
    sns.distplot(data['alcohol'][data.target==i],
                 kde=1,label='{}'.format(i))

plt.legend()
import matplotlib.gridspec as gridspec

for feature in raw_data['feature_names']:
    print(feature)
    # sns.boxplot(data=data,x=data.target,y=data[feature])
    gs1 = gridspec.GridSpec(3, 1)
    ax1 = plt.subplot(gs1[:-1])
    ax2 = plt.subplot(gs1[-1])


    plt.show()
from sklearn.model_selection import train_test_split

data_train, data_test, label_train, label_test = \
    train_test_split(raw_data['data'],raw_data['target'],
                     test_size=0.2)
print(len(data_train),' samples in training data\n',
      len(data_test),' samples in test data\n', )
from sklearn.naive_bayes import GaussianNB
from sklearn.svm import SVC, LinearSVC
from sklearn.neighbors import KNeighborsClassifier
from sklearn.linear_model import LogisticRegression
from sklearn import tree
from sklearn.neural_network import MLPClassifier
from sklearn.ensemble import GradientBoostingClassifier
from sklearn.gaussian_process.kernels import RBF
from sklearn.ensemble import RandomForestClassifier

dict_classifiers = {
    "Logistic Regression":
        {'classifier': LogisticRegression(),
         'params': [
             {
                 'penalty': ['l1', 'l2'],
                 'C': [0.001, 0.01, 0.1, 1, 10, 100, 1000]
             }
         ]
         },
    "Nearest Neighbors":
        {'classifier': KNeighborsClassifier(),
         'params': [
             {
                 'n_neighbors': [1, 3, 5, 10],
                 'leaf_size': [3, 30]
             }
         ]
         },

    "Linear SVM":
        {'classifier': SVC(),
         'params': [
             {
                 'C': [1, 10, 100, 1000],
                 'gamma': [0.001, 0.0001],
                 'kernel': ['linear']
             }
         ]
         },
    "Gradient Boosting Classifier":
        dict(classifier=GradientBoostingClassifier(), params=[
            {
                'learning_rate'















                'params': {}
            },
            "Naive Bayes",
            {'classifier': GaussianNB(),
             'params': {}
             },


