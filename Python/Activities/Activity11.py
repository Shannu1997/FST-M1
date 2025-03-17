fruits_dict = {
    "apple":190,
    "pomegrante":180,
    "orange":120,
    "mango":80
    }

Fruit_wanted = input("Enter the fruit you want : ").lower()

if(Fruit_wanted in fruits_dict):
        print(Fruit_wanted.upper(), "is available and price per kg is ",fruits_dict[Fruit_wanted])
else:
        print(Fruit_wanted.upper(), "is not available, pls come after sometime .. ")

