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
            estudiante = new Robot(objetos,0, 2, Direction.WEST,10);
            
	    /*Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move ();
            */
            
            rotation(2);
            distance(1);
            rotation(3);
            distance(3);
            rotation(3);
            distance(3);
            rotation(3);
            distance(3);
            rotation(3);
            distance(2);
            rotation(2);
            /*
            //Tomando decisiones, Si puedo tomar un Thing
            boolean puedeTomar = estudiante.canPickThing();
            
            //Tomar un Thing
            if(puedeTomar == true)
               estudiante.pickThing();
            
            //Especifica el numero de Thing que tiene en robot en el bolso
            int numeroThings = estudiante.countThingsInBackpack();
            
            //Poner Thing, se debe validar que tenga things en el bolso
            estudiante.putThing();
                       
            //Si el frente esta libre de Wall
            estudiante.frontIsClear();
            
            //Toman un Thing
            estudiante.pickThing();*/
            
            
            
	}
        public static void distance(int c){
            for(int i=0;i<c;i++){
                estudiante.move();
            }
        }
        public static void rotation(int c){
            for(int i=0;i<c;i++){
                estudiante.turnLeft();
            }
        }
}