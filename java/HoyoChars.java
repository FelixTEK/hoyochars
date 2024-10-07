//FelixTEK 2024
public class HoyoChars{
    private String name;
    private byte element; //0 = anemo/wind, 1 = geo/physical, 2 = electro/lightning, 3 = dendro/imaginary, 4 = hydro/quantum, 5 = pyro/fire, 6 = cryo/ice
    private byte weapon; //0 = sword, 1 = bow, 2 = catalyst, 3 = polearm, 4 = claymore
    private boolean isMale; //true = male, false = female
    private boolean isGenshin; //true = genshin, false = star rail

    public HoyoChars(String charName, byte charElement, byte charWeapon, boolean charIsMale, boolean charIsGenshin){
        name = charName;
        element = (byte) charElement;
        weapon = (byte) charWeapon;
        isMale = charIsMale;
        isGenshin = charIsGenshin;
    }

    String getName(){
        return this.name;
    }

    @Override public String toString(){
        //name is index 1
        //isGenshin is index 3
        //element is index 5
        //weapon is index 7
        //isMale is index 9
        System.out.println("================================================================");
        String[] returnText = {"This character is ", this.name, " from the game ", "isGenshin", ".\nThe character has the element of ", "element", " and wields a ", "great potential", ". \nThey are ", "isMale", "."}; 
        
        if (this.isGenshin) {
            switch (this.element) {
                case (byte)0:
                    returnText[5] = "Anemo";
                    break;
                case (byte)1:
                    returnText[5] = "Geo";
                    break;
                case (byte)2:
                    returnText[5] = "Electro";
                    break;
                case (byte)3:
                    returnText[5] = "Dendro";
                    break;
                case (byte)4:
                    returnText[5] = "Hydro";
                    break;
                case (byte)5:
                    returnText[5] = "Pyro";
                    break;
                case (byte)6:
                    returnText[5] = "Cryo";
                    break;
                default:
                    break;
            }
            switch (this.weapon){
                case (byte)0:
                    returnText[7] = "sword";
                    break;
                case (byte)1:
                    returnText[7] = "bow";
                    break;
                case (byte)2:
                    returnText[7] = "catalyst";
                    break;
                case (byte)3:
                    returnText[7] = "polearm";
                    break;
                case (byte)4:
                    returnText[7] = "claymore";
                    break;
                default:
                    break;
            }

            returnText[3] = "Genshin Impact";
        }

        else {
            switch (this.element) {
                case (byte)0:
                    returnText[5] = "wind";
                    break;
                case (byte)1:
                    returnText[5] = "physical";
                    break;
                case (byte)2:
                    returnText[5] = "lightning";
                    break;
                case (byte)3:
                    returnText[5] = "imaginary";
                    break;
                case (byte)4:
                    returnText[5] = "quantum";
                    break;
                case (byte)5:
                    returnText[5] = "fire";
                    break;
                case (byte)6:
                    returnText[5] = "ice";
                    break;
                default:
                    break;
            } 
        returnText[3] = "Honkai: Star Rail";
        }

        if (this.isMale) returnText[9] = "male";
        else returnText[9] = "female";

        StringBuilder joinText = new StringBuilder();
        for (int i = 0; i < returnText.length; i++){
            joinText.append(returnText[i]);
        }
        return joinText.toString(); //This is toString of the StringBuilder class!
    }

    public static void main(String[] args) {
        /*byte element; //0 = anemo/wind, 1 = geo/physical, 2 = electro/lightning, 3 = dendro/imaginary, 4 = hydro/quantum, 5 = pyro/fire, 6 = cryo/ice
        *byte weapon; //0 = sword, 1 = bow, 2 = catalyst, 3 = polearm, 4 = claymore
        *boolean isMale; //true = male, false = female
        * boolean isGenshin; //true = genshin, false = star rail
        */
        HoyoChars Ayaka = new HoyoChars("Kamisato Ayaka", (byte)6, (byte)0, false, true);
        HoyoChars Yelan = new HoyoChars("Yelan", (byte)4, (byte)1, false, true);
        HoyoChars Zhongli = new HoyoChars("Zhongli", (byte)1, (byte)3, true, true);
        HoyoChars Ruan_Mei = new HoyoChars("Ruan Mei", (byte)6, (byte)0, false, false);
        HoyoChars Jing_Yuan = new HoyoChars("Jing Yuan", (byte)2, (byte)0, true, false);
        System.out.println(Ayaka.toString());
        System.out.println(Yelan.toString());   
        System.out.println(Zhongli.toString());
        System.out.println(Ruan_Mei.toString());
        System.out.println(Jing_Yuan.toString());
        /*int test = Ruan_Mei.getName().length();
        System.out.println(test);*/
    }
}