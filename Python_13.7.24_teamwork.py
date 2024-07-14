# task 1.(Girta)

import pandas as pd
import matplotlib.pyplot as plt

file_name = 'transaction_dataset.csv'
df = pd.read_csv(file_name)

print(df.head())

gender_counts = df['Gender'].value_counts(dropna=False)

gender_counts.plot(kind='bar')
plt.title('Count of Customers by Gender')
plt.xlabel('Gender')
plt.ylabel('Count')
plt.show()



# task 2.(Girta)

import pandas as pd
import matplotlib.pyplot as plt

file_name = 'transaction_dataset.csv'
df = pd.read_csv(file_name)

print(df.head())

name_counts = df['Name'].value_counts().reset_index()
name_counts.columns = ['Name', 'Count']

top_5_names = name_counts.iloc[:5]

plt.figure(figsize=(10, 6))
plt.barh(top_5_names['Name'], top_5_names['Count'], color='skyblue')
plt.xlabel('Count')
plt.ylabel('Name')
plt.title('Top 5 Most Frequent Names')
plt.gca().invert_yaxis()  # AI help: invert the Y-axis so that the most frequent name is at the top
plt.show()
