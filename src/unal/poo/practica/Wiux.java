package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
        
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,6, 2, Direction.NORTH,10);
            detect();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.move();
            detect();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.move();
            detect();
             
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
        
        public static void turnRight(){
            estudiante.move();
            estudiante.move();
            estudiante.move(); 
        }
        
        public static void detect(){
            
            estudiante.move ();
            
            if(puedeTomar == true){
               
               turnRigth();                   
               estudiante.move ();
               estudiante.turnLeft();
               estudiante.move();
                if(puedeTomar == true){
                    count.pickThing();
                    estudiante.move();
                    estudiante.turnLeft();
                    estudiante.move();
                    if(puedeTomar == true){
                    
                        estudiante.move();
                        estudiante.turnLeft();
                        estudiante.move();
                        if(puedeTomar == true){
                            estudiante.move ();
                            turnRigth(); 
                            estudiante.move ();
                            estudiante.move ();
                            turnRigth(); 
                            estudiante.move ();
                            if(puedeTomar == true){
                               estudiante.move ();
                               turnRigth();
                               estudiante.move ();
                               estudiante.move ();
                               estudiante.turnLeft();
                               estudiante.move();
                               if(puedeTomar == true){
                                   System.out.print("8");
                               }
                               else{
                                   System.out.print("9");
                               }
                            }
                            else{
                               estudiante.move ();
                               turnRigth();
                               estudiante.move ();
                               estudiante.move ();
                               estudiante.turnLeft();
                               estudiante.move();
                               if(puedeTomar == true){
                                   System.out.print("6");
                               }
                               else{
                                   System.out.print("5");
                               }
                            estudiante.turnLeft();
                            estudiante.move();
                            turnRigth();
                            estudiante.move ();
                            estudiante.move ();
                            }
                            
                        }
                        else{
                            System.out.print("3");
                            turnRigth();                   
                            estudiante.move ();
                            turnRigth();                   
                            estudiante.move ();
                            estudiante.move ();
                            estudiante.move ();
                            estudiante.move ();
                        }
                    }
                    else{
                        System.out.print("0");
                        estudiante.turnLeft();
                        estudiante.move();
                        estudiante.move();
                        estudiante.move();

                    }
                }
                else{
                   System.out.print("2"); 
                   estudiante.turnLeft();
                   estudiante.move();
                   estudiante.turnLeft();
                   estudiante.move();
                   estudiante.move();
                   
                }
            }
            else{
            turnRigth();                   
            estudiante.move ();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.move();
            
            if(puedeTomar == true){
               
               System.out.print("7");
               estudiante.turnLeft();
               estudiante.move();
               estudiante.move();
               estudiante.move();
               estudiante.move();
               estudiante.move();
               
            }
            else{
               turnRigth();
               estudiante.move();
               estudiante.turnLeft();
               estudiante.move();
               
               if(puedeTomar == true){
                
                System.out.print("4");
               
               }
               else{
                turnRigth();
                System.out.print("1");
               }
               
               estudiante.turnLeft();
               estudiante.move();
               turnRight();
               estudiante.move();
               estudiante.move();
               estudiante.move();
               estudiante.move();
               
            }
            }
         } 
        
}

