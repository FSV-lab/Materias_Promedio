/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package materias_promedio;

import java.util.Scanner;

/**
 *
 * @author ferch
 */
public class Materias_Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
      
      System.out.println("MATERIAS");
      System.out.println("a.Matematicas");
      System.out.println("b.Español");
      System.out.println("c.Ingles");
      
      double n1,n2,n3,Mat=0,Esp=0,Ing=0,Prom;
      int estud,cont2=1,cont3 = 1;
      char menu= entrada.next().charAt(0);
      
      switch(menu)
      {
          case'a':
              System.out.println("Matematicas:");
              System.out.println("Ingresa el numero total de estudiantes en esta materia:");
              
              estud= entrada.nextInt();
              
              for(int cont=1; cont<=estud;cont++)
              {
                System.out.println("Ingrese nota  del estudiante:"+cont+ "");
                n1=entrada.nextDouble();
                Mat=Mat+n1;
              }
              Prom=Mat/estud;
              System.out.println("El promedio del grupo de matematicas es:"+Prom);
              break;
              
              case'b':
                System.out.println("Español:");
              System.out.println("Ingresa el numero total de estudiantes en esta materia:");
              estud= entrada.nextInt();
              
              while (cont2<=estud){
                System.out.println("Ingrese nota  del estudiante:"+cont2+ "");
                n2=entrada.nextDouble();
                Esp=Esp+n2;
                cont2++;
              }
              Prom=Esp/estud;
              System.out.println("El promedio del grupo de español es:"+Prom);
              break;
              
              case'c':
                System.out.println("Ingles:");
              System.out.println("Ingresa el numero total de estudiantes en esta materia:");
              estud= entrada.nextInt();  
              
              do{
               System.out.println("Ingrese nota  del estudiante:"+cont3+ "");
                n3=entrada.nextDouble();
                Ing=Ing+n3;
                cont3++;   
              } while(cont3<=estud);
              Prom=Ing/estud;
              System.out.println("El promedio del grupo de Ingles es:"+Prom);
              break;
              
              
              
              
              
                
              
        
    } 
      
        
    }
}
    
    
