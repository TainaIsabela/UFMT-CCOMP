import panda as pd
from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import GaussianNB
from sklearn.metrics import accuracy_score

column = ["Fruta", "Long", "Sweet", "Yellow", "Total"]
data = pd.read_cvs('Tabela de frutas.data.cvs', names = column)
data.head()
X = data.iloc[:,0:-1] # X is the features in our dataset
y = data.iloc[:,-1]   # y is the Labels in our dataset
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.33, random_state=42)
model = GaussianNB().fit(X_train, y_train)
predicted_y = model.predict(X_test)
accuracy_score = accuracy_score(y_test, predicted_y)
print (accuracy_score)
person = pd.DataFrame()

# Create an empty dataframe that we have to predict
person = pd.DataFrame()

# Create some feature values for this single row
person['Pregnancies'] = [7]
person['Glucose'] = [130]
person['BloodPressure'] = [86]
person['SkinThickness'] = [34]
person['Insulin'] = [0]
person['BMI'] = [33.5]
person['DiabetesPedigreeFunction'] = [0.564]
person['Age'] = [50]
# View the data
person
predicted_y = model.predict(person)
print (predicted_y)
