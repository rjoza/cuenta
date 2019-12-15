/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.Scanner;

/**
 *
 * @author ronny.joza
 */
public class BancoPersona {
    public static void main(String arg[])
    {
        
        Banco banco = new Banco();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Bienvenido al banco xyz ,por favor ingrese su numero de cuenta");
        int cuenta =sc.nextInt();
        String operacion="";
        
        switch (cuenta){
            case 1:
                
                System.out.println("Bienvenido " +banco.getPer1().getNombre());
                System.out.println("----------------------------------");
                System.out.println("Ingrese la operacion a realizar");
                System.out.println("A-DEPOSITAR");
                System.out.println("B-RETIRO");
                operacion = sc.next();
                switch (operacion)
                {
                    case "A":
                          System.out.println("----------------------------------");
                            System.out.println("Ingrese el monto a depositar");
                            double montoDeposito = sc.nextDouble();
                            double montoAnteriorDeposito = banco.getPer2().getMonto();
                            banco.getPer1().setMonto(montoAnteriorDeposito+montoDeposito);
                            System.out.println("El monto final es" + banco.getPer1().getMonto());
                            
                        break;
                        
                    case "B":
                        System.out.println("----------------------------------");
                            System.out.println("Ingrese el monto a retirar");
                            double montoRetiro = sc.nextDouble();
                            double montoAnteriorRetiro = banco.getPer1().getMonto();
                            banco.getPer1().setMonto(montoAnteriorRetiro-montoRetiro);
                            System.out.println("El monto final es" + banco.getPer1().getMonto());
                            
                        break;
                    
                    
                }
                    
                break;
                
            case 2:
                System.out.println("Bienvenido " + banco.getPer2().getNombre());
                System.out.println("----------------------------------");
                
                System.out.println("Ingrese la operacion a realizar");
                System.out.println("A-DEPOSITAR");
                System.out.println("B-RETIRO");
                operacion = sc.next();
                switch (operacion)
                {
                    case "A":
                          System.out.println("----------------------------------");
                            System.out.println("Ingrese el monto a depositar");
                            double montoDeposito = sc.nextDouble();
                            double montoAnteriorDeposito = banco.getPer2().getMonto();
                            banco.getPer2().setMonto(montoAnteriorDeposito+montoDeposito);
                            System.out.println("El monto final es" + banco.getPer2().getMonto());
                            
                        break;
                        
                    case "B":
                        System.out.println("----------------------------------");
                            System.out.println("Ingrese el monto a retirar");
                            double montoRetiro = sc.nextDouble();
                            double montoAnteriorRetiro = banco.getPer2().getMonto();
                            banco.getPer2().setMonto(montoAnteriorRetiro-montoRetiro);
                            System.out.println("El monto final es" + banco.getPer2().getMonto());
                            
                        break;
                    
                    
                }
                break;
                
            case 3:
                System.out.println("Bienvenido " + banco.getPer3().getNombre());
                System.out.println("----------------------------------");
                
                  System.out.println("Ingrese la operacion a realizar");
                System.out.println("A-DEPOSITAR");
                System.out.println("B-RETIRO");
                operacion = sc.next();
                switch (operacion)
                {
                    case "A":
                          System.out.println("----------------------------------");
                            System.out.println("Ingrese el monto a depositar");
                            double montoDeposito = sc.nextDouble();
                            double montoAnteriorDeposito = banco.getPer3().getMonto();
                            banco.getPer3().setMonto(montoAnteriorDeposito+montoDeposito);
                            System.out.println("El monto final es" + banco.getPer3().getMonto());
                            
                        break;
                        
                    case "B":
                        System.out.println("----------------------------------");
                            System.out.println("Ingrese el monto a retirar");
                            double montoRetiro = sc.nextDouble();
                            double montoAnteriorRetiro = banco.getPer3().getMonto();
                            banco.getPer3().setMonto(montoAnteriorRetiro-montoRetiro);
                            System.out.println("El monto final es" + banco.getPer3().getMonto());
                            
                        break;
                    
                    
                }
                break;     
            default:
                System.out.println("Cuenta no registrada");
                System.exit(0);
        }
        
        System.out.println(banco.getPer1().getMonto()+banco.getPer2().getMonto()+banco.getPer3().getMonto());
    }
    
}
