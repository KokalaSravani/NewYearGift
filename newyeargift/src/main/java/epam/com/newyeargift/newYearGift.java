package epam.com.newyeargift;

import java.util.ArrayList;
import java.util.*;

public class newYearGift{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Sweets> l = new ArrayList();
        l.add(new Chocolates("Perk",5,30.5f,20));
		l.add(new Chocolates("MilkyBar",25,50.2f,40));
		l.add(new Chocolates("Munch",31,31.5f,40));
		l.add(new Chocolates("KitKat",40,30.3f,65));
		l.add(new Toffee("Jelly",5,5.1f,45));
		l.add(new Toffee("Rancher",10,5.1f,50));
		l.add(new Toffee("Tofuls",15,7.5f,65));
		l.add(new fivestar("Peanuts",50,8.1f,90));
		l.add(new fivestar("LaffyTaffy",90,30.1f,75));
		l.add(new fivestar("Nerds",20,2.5f,10));
		l.add(new  fivestar("Galaxy",30,13.6f,20));
        l.add(new fivestar("BubbleGum",10,3.0f,10));
        List<Sweets> choc = new ArrayList();
        float totalWeight = 0;
        for(Sweets s: l)
            totalWeight+=s.weight;
        System.out.println("\nTotal Weight = "+totalWeight);
        for(Sweets s: l){
            if(s instanceof Chocolates)
                choc.add(s);
        }
        System.out.println("\nsorting process......\n");
        System.out.println("Select your choice to sort based on :\n");
        System.out.println("1.Cost\n2.Weight\n3.SweetContent\n");
        int option = sc.nextInt();
        if(option == 1)Collections.sort(choc,new sortByCost());
        else if(option == 2)Collections.sort(choc,new sortByWeight());
        else Collections.sort(choc,new sortBySweetContent());
        System.out.println("Chocolates Present are:");
		for(Sweets s:choc){
			System.out.println(s.name+" "+s.cost+" "+s.weight+" "+s.sweetContent);
		}
		System.out.println("Do you Want List of fivestar(y/n)");
		char c=sc.next().charAt(0);
		if(c=='y'){
			System.out.print("Enter the Option :\n1.Cost\n2.Weight\n3.SweetContent\n");
			option=sc.nextInt();
			System.out.println("Enter the Range");
			int min=sc.nextInt();
			int max=sc.nextInt();
			if(option==1) {
				for(Sweets cur:l) {
					if(cur instanceof fivestar && cur.cost>=min && cur.cost<=max){
						System.out.println(cur.name+" "+cur.cost+" "+cur.weight+" "+cur.sweetContent);
					}
				}
			}
			else if(option==2) {
				for(Sweets cur:l) {
					
					if(cur instanceof fivestar && cur.weight>=min && cur.weight<=max){
						System.out.println(cur.name+" "+cur.cost+" "+cur.weight+" "+cur.sweetContent);
					}
				}
			}
			else {
				for(Sweets cur:l) {
					
					if(cur instanceof fivestar && cur.sweetContent>=min && cur.sweetContent<=max){
						System.out.println(cur.name+" "+cur.cost+" "+cur.weight+" "+cur.sweetContent);
					}
				}
			}
		}
		sc.close();
	}
}