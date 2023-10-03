
package com.car.springboot.car;

import java.util.ArrayList;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController



public class DataController {
    
    @RequestMapping("/car")
    
        public List<Car> Cars() {
            List<Car> list = new ArrayList<>();
            
            
//      Car 1 
            list.add(new Car(2013,
                                        "BMW 328i xDrive",
                                        "Sedan",
                                        56632,
                                        "Black"));
            
            
//      Car 2 
            list.add(new Car(2023,
                                        "Tesla Model 3",
                                        "Sedan",
                                        2316,
                                        "White"));        
            
            
//      Car 3 
            list.add(new Car(2015,
                                        "Honda Accord",
                                        "Sedan",
                                        76522,
                                        "Black"));         
            
            
//      Car 4 
            list.add(new Car(2024,
                                        "Tesla Cyber Truck",
                                        "Truck",
                                        10,
                                        "Chrome"));          
            

//      Car 5 
            list.add(new Car(2020,
                                        "Tesla Model 3",
                                        "Sedan",
                                        10109,
                                        "White"));          
            

//      Car 6 
            list.add(new Car(2023,
                                        "BMW M4",
                                        "Coupe",
                                        20386,
                                        "Blue"));       
            
            
//      Car 7 
            list.add(new Car(2023,
                                        "Ford F-150",
                                        "Truck",
                                        30899,
                                        "Dark-Grey"));       

            
//      Car 8 
            list.add(new Car(2002,
                                        "Dodge RAM 1500 VAN",
                                        "Van",
                                        208361,
                                        "White"));         
            
            
//      Car 9 
            list.add(new Car(2024,
                                        "Corvette Stingray 1LT",
                                        "Coupe",
                                        8,
                                        "Red"));              
            
            
//      Car 10 
            list.add(new Car(2016,
                                        "Honda ODYSSEY",
                                        "Van",
                                        99672,
                                        "Tan"));       
            
            
            return list;
            
        }
}


// OLD VERSION BELOW


// Make car OBJ and put info inside   

//        Car car1 = new Car();                                                       // Car 1
//        car1.setModelYear(2013);
//        car1.setModelName("BMW 328i xDrive");
//        car1.setBodyShape("Sedan");
//        car1.setMilesDriven(56632);
//        car1.setCarColor("Black");
//
//        Car car2 = new Car();
//        car2.setModelYear(2023);                                                       // Car 2
//        car2.setModelName("Tesla Model 3");
//        car2.setBodyShape("Sedan");
//        car2.setMilesDriven(2316);
//        car2.setCarColor("White");
//        
//        Car car3 = new Car();                                                                  // Car 3
//        car3.setModelYear(2015);
//        car3.setModelName("Honda Accord");
//        car3.setBodyShape("Sedan");
//        car3.setMilesDriven(76522);
//        car3.setCarColor("Black");
//        
//        Car car4 = new Car();                                                                                // Car 4
//        car4.setModelYear(2024);
//        car4.setModelName("Tesla Cyber Truck");
//        car4.setBodyShape("Truck");
//        car4.setMilesDriven(10);
//        car4.setCarColor("Chrome - Grey");
//        
//        Car car5 = new Car();                                                                                        // Car 5
//        car5.setModelYear(2020);
//        car5.setModelName("Tesla Model 3");
//        car5.setBodyShape("Sedan");
//        car5.setMilesDriven(10109);
//        car5.setCarColor("White");
//        
//        Car car6 = new Car();                                                                                    // Car 6
//        car6.setModelYear(2023);
//        car6.setModelName("BMW M4");
//        car6.setBodyShape("Coupe");
//        car6.setMilesDriven(20386);
//        car6.setCarColor("Blue");
//        
//                
//        Car car7 = new Car();                                                                                    // Car 7
//        car7.setModelYear(2023);
//        car7.setModelName("Ford F-150");
//        car7.setBodyShape("Truck");
//        car7.setMilesDriven(30899);
//        car7.setCarColor("Dark-Grey");
//        
//        Car car8 = new Car();;                                                                                    // Car 8
//        car8.setModelYear(2002);
//        car8.setModelName("Dodge RAM 1500 VAN");
//        car8.setBodyShape("Truck");
//        car8.setMilesDriven(208361);
//        car8.setCarColor("White");
//        
//        Car car9 = new Car();;                                                                                    // Car 9
//        car9.setModelYear(2024);
//        car9.setModelName("Corvette Stingray 1LT");
//        car9.setBodyShape("Coupe");
//        car9.setMilesDriven(8);
//        car9.setCarColor("Red");
//        
//        Car car10 = new Car();                                                                                    // Car 10
//        car10.setModelYear(2016);
//        car10.setModelName("Honda ODYSSEY");
//        car1.setBodyShape("Van");
//        car1.setMilesDriven(99672);
//        car10.setCarColor("Tan");