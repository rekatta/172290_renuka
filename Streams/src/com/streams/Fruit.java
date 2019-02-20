package com.streams;
class Fruit 
{ 
      String fruit_Name; 
        String color; 
        int calories; 
        int price;
        
		public Fruit(String fruit_Name, int calories, int price,String color) {
			super();
			this.fruit_Name = fruit_Name;
			this.color = color;
			this.calories = calories;
			this.price = price;
		}
		public String getFruit_Name() {
			return fruit_Name;
		}
		public String getColor() {
			return color;
		}
		public int getCalories() {
			return calories;
		}
		public int getPrice() {
			return price;
		}
}	