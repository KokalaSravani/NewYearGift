package epam.com.newyeargift;

import java.util.*;
class sortByCost implements Comparator<Sweets>{

	public int compare(Sweets s1, Sweets s2) {
		return s1.cost-s2.cost;
	}
}
class sortByWeight implements Comparator<Sweets>{
	public int compare(Sweets s1, Sweets s2) {
		return Float.compare(s1.weight,s2.weight);
	}
}
class sortBySweetContent implements Comparator<Sweets>{
	public int compare(Sweets s1, Sweets s2) {
		return s1.sweetContent-s2.sweetContent;
	}
}


class Sweets{
    String name;
    int cost;
    float weight;
    int sweetContent;
    Sweets(String name,int cost,float weight,int sweetContent){
        this.name = name;
        this.cost =  cost;
        this.weight = weight;
        this.sweetContent = sweetContent;
    }

}