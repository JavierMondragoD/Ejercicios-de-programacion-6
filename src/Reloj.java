/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Stack;
/**
 *
 * @author JOSE JAVIER
 */   
import javax.swing.JOptionPane;

public class Reloj {
	
Stack<Float> pila=new Stack<Float>();
	
public void HoraT(float ingresa,float cantidad){
   	 
pila.push((float) (ingresa + cantidad) % 24); 


while (!pila.empty())
			
JOptionPane.showMessageDialog(null,"En "+cantidad+ " horas,"+" El reloj marcara las:\n " + pila.pop()+" horas");
    }
    
}
