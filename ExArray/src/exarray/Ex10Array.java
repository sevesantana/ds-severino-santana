/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exarray;

/**
 *
 * @author snsf2
 */
public class Ex10Array {
    public static void main(String[] args){
        int n[] = {-10, -2, -3, -4, -5, 6, 7, 8, 9, 10};
        
        for(int i = 0; i < n.length; i++){
            if(n[i] < 0){
                n[i] = 0;
            }
            System.out.println(n[i]);
        }
    }
}
