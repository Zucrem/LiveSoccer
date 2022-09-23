/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livescorebound;

import java.util.Scanner;

/**
 *
 * @author Zucrem
 */
public class LiveScoreBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subscriber obj1 = new Subscriber();
        LiveScoreBean obj = new LiveScoreBean();
        System.out.print("How many Subscriber : ");
        int people = sc.nextInt();
        sc.nextLine();
        if (people < 2) {
            System.out.println("Error");
            return;
        }
        System.out.println();
        for (int i = 0;i < people;i++) obj.addPropertyChangeListener(obj1);
        while (true){
        System.out.print("Enter Score ");
        String score = sc.nextLine();
        if (score.equals("")) break;
        System.out.println();
        obj.setScoreLine(score);
        }
        System.out.println("\nThank you for using This Program");
    }
    
}
