//FelixTEK 2024
public class HoyoChars{
    final private String name;
    final private byte element; //0 = anemo/wind, 1 = geo/physical, 2 = electro/lightning, 3 = dendro/imaginary, 4 = hydro/quantum, 5 = pyro/fire, 6 = cryo/ice
    final private byte weapon; //0 = sword, 1 = bow, 2 = catalyst, 3 = polearm, 4 = claymore
    final private boolean isMale; //true = male, false = female
    final private boolean isGenshin; //true = genshin, false = star rail

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

    String getElement(){
        if (this.isGenshin) {
            switch (this.element) {
                case (byte)0:
                    return "Anemo";
                case (byte)1:
                    return "Geo";
                case (byte)2:
                    return "Electro";
                case (byte)3:
                    return "Dendro";
                case (byte)4:
                    return "Hydro";
                case (byte)5:
                    return "Pyro";
                case (byte)6:
                    return "Cryo";
            }
        }
        else {
            switch (this.element) {
                case (byte)0:
                    return "Wind";
                case (byte)1:
                    return "Physical";
                case (byte)2:
                    return "Lightning";
                case (byte)3:
                    return "Imaginary";
                case (byte)4:
                    return "Quantum";
                case (byte)5:
                    return "Fire";
                case (byte)6:
                    return "Ice";
            }
        }
        return "No element provided";
    }

    String getWeapon(){
        if (this.isGenshin) {
            switch (this.weapon){
                case (byte)0:
                    return "Sword";
                case (byte)1:
                    return "Bow";
                case (byte)2:
                    return "Catalyst";
                case (byte)3:
                    return "Polearm";
                case (byte)4:
                    return "Claymore";
                default:
                    return "No weapon provided";
            }
        }
        else {
            return "Light Cone";
        }
    }

    String getGender(){
        if (this.isMale) {
            return "Male";
        }
        else {
            return "Female";
        }
    }

    String getGame(){
        if (this.isGenshin) {
            return "Genshin Impact";
        }
        else {
            return "Honkai: Star Rail";
        }
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
    /* for testing only! 
    public static void main(String[] args) {
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
        System.out.println(Ayaka.getWeapon());
        System.out.println(Yelan.getElement());
        System.out.println(Ruan_Mei.getGame());
        System.out.println(Jing_Yuan.getWeapon());
        System.out.println(Zhongli.getGender());
    }*/
}
    