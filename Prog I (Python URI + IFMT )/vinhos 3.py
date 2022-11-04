import pandas as pd
from sklearn.tree import DecisionTreeClassifier
from sklearn.ensemble import RandomForestClassifier, GradientBoostingClassifier
from sklearn.model_selection import train_test_split
from sklearn.metrics import precision_recall_fscore_support, confusion_matrix
df = pd.read_csv('winequality-white.csv',sep=';',quotechar='"')
df.columns
df['quality'].unique()

df['quality'].describe()
df['quality'].value_counts()

def isTasty(quality):
    if quality >= 7:
        return 1
    else:
        return 0
df['tasty'] = df['quality'].apply(isTasty)
df.columns
df['tasty'].value_counts()

data = df[['fixed acidity', 'volatile acidity', 'citric acid', 'residual sugar','chlorides', 'free sulfur dioxide', 'total sulfur dioxide', 'density', 'pH', 'sulphates', 'alcohol']]
target = df['tasty']

data_train, data_test, target_train, target_test = train_test_split(data,target,test_size = 0.33,random_state=123)
[subset.shape for subset in [data_train,data_test,target_train,target_test]]
simpleTree = DecisionTreeClassifier(max_depth=5)
simpleTree.fit(data_train,target_train)
gbmTree = GradientBoostingClassifier(max_depth=5)
gbmTree.fit(data_train,target_train)
rfTree = RandomForestClassifier(max_depth=5)
rfTree.fit(data_train,target_train)
simpleTreePerformance = precision_recall_fscore_support(target_test,simpleTree.predict(data_test))
gbmTreePerformance = precision_recall_fscore_support(target_test,gbmTree.predict(data_test))
rfTreePerformance = precision_recall_fscore_support(target_test,rfTree.pedict(data_test))
simpleTreePerformance
gbmTreePerformance
rfTreePerformance

print('Precision, Recall, Fscore, and Support for each class in simple, gradient boosted, and random forest tree classifiers:'+'\n')
for treeMethod in [simpleTreePerformance,gbmTreePerformance,rfTreePerformance]:
    print('Precision: ',treeMethod[0])
    print('Recall: ',treeMethod[1])
    print('Fscore: ',treeMethod[2])
    print('Support: ',treeMethod[3],'\n')
print('Confusion Matrix for simple, gradient boosted, and random forest tree classifiers:')
print('Simple Tree:\n',confusion_matrix(target_test,simpleTree.predict(data_test)),'\n')
print('Gradient Boosted:\n',confusion_matrix(target_test,gbmTree.predict(data_test)),'\n')
print('Random Forest:\n',confusion_matrix(target_test,rfTree.predict(data_test)))
gbmTree.feature_importances_
print('Feature Importances for GBM tree\n')
for importance,feature in zip(gbmTree.feature_importances_,['fixed acidity', 'volatile acidity', 'citric acid', 'residual sugar','chlorides', 'free sulfur dioxide', 'total sulfur dioxide', 'density', 'pH', 'sulphates', 'alcohol']):
    print('{}: {}'.format(feature,importance))



