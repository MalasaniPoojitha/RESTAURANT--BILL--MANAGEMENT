package food;
import java.util.LinkedHashMap;

public class Itemprices {
	public void setprices() {
		LinkedHashMap<String,Integer> tsa =new LinkedHashMap<String,Integer>();  
		tsa.put("Golichina",310);
		tsa.put("Karimnagar Fried Wings",290);
		tsa.put("Malnadu Chicken Roast",290);
		tsa.put("Kara Kara Prawns",350);
		tsa.put("Koramenu Roast ",390);
	LinkedHashMap<String,Integer> tsm =new LinkedHashMap<String,Integer>(); 
	tsm.put("Tomato Pappu",210);
	tsm.put("Mudda Pappu",240);
	tsm.put("Vankaya Masala",240);
	tsm.put("Natu Kodi Koora",370);
	tsm.put("Tomato Pappu",210);
	tsm.put("Koramenu Pulusu",380);
	LinkedHashMap<String,Integer> kb =new LinkedHashMap<String,Integer>(); 
	kb.put("Tandoori",270);
	kb.put("Corn Tikka",240);
	kb.put("Paneer Tikka",250);
	kb.put("Fish Tikka",350);
	kb.put("Tandoori Prawns",350);
	LinkedHashMap<String,Integer> ib =new LinkedHashMap<String,Integer>();
	ib.put("Tandoori Roti",40);
	ib.put("Paratha",70);
	ib.put("Naan",60);
	ib.put("Rumal Roti",40);
	ib.put("Roti Basket",210);
	ib.put("Phulka",30);
	LinkedHashMap<String,Integer> mcv =new LinkedHashMap<String,Integer>();
	mcv.put("Jeera Alu",210);
	mcv.put("Baby Corn",270);
	mcv.put("Paneer curry",280);
	mcv.put("Veg curry",230);
	mcv.put("Dal",210);
	LinkedHashMap<String,Integer> mcnv =new LinkedHashMap<String,Integer>();
	mcnv.put("Egg",230);
	mcnv.put("Chicken",290);
	mcnv.put("Mutton",350);
	mcnv.put("Prawns",350);
	mcnv.put("Fish",350);
	LinkedHashMap<String,Integer> pbr =new LinkedHashMap<String,Integer>();
	pbr.put("Veg fried rice ",250);
	pbr.put("Vankaya Pulao",250);
	pbr.put("Paneer rice",270);
	pbr.put("Egg fried rice",250);
	pbr.put("Chicken rice",280);
	pbr.put("Mutton rice",390);
	pbr.put("Kheema Biryani",390);
	pbr.put("Sambar Rice",230);
	pbr.put("Curd Rice",190);
	LinkedHashMap<String,Integer> ds =new LinkedHashMap<String,Integer>();
	ds.put("Carrot Halwa",130);
	ds.put("Qurbani Ka Mita with Ice Cream",160);
	ds.put("Choice Of Ice Cream",140);
	LinkedHashMap<String,Integer> bv =new LinkedHashMap<String,Integer>();
	bv.put("Water Bottle",25);
	bv.put("Soft Drink",40);
	bv.put("Fresh lime Soda",60);
	bv.put("Lassi",80);
	Menu m=new Menu();
	m.menu(tsa,tsm,kb,ib,mcv,mcnv,pbr,ds,bv);
	}

}
