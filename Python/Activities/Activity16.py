class Car:
    'This is car class.. '
    def __init__(self,manufacturer, model, make, transmission, color):
        self.manufacturer= manufacturer
        self.model= model
        self.make= make
        self.color= color

        # accelerate(), stop()
    def accelerate(self):
            print(self.manufacturer +" "+self.model +"is moving.. ")
    
    def stop(self):
             print(self.manufacturer +" "+self.model +" has stopped ")


c1 = Car("Honda", "civic",2024,"Automatic","Black")
c2= Car("Nexa", "Baleno",2024,"Manual","Blue")
c3= Car("Tata", "Nexon",2026,"Automatic","Red")

try:
      c1.accelerate()
      c1.stop()
except:
    print(Exception)
