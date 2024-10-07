# HoyoChars

A simple class that lets you print out characters in the way of Hoyoverse's games' characters. Namely Genshin Impact and Honkai: Star Rail.

## What does it do?

Simply put, it lets you type in ANY character with its attributes (weapon, element, gender, game) and display it. You can also adapt it in any piece of code you want by importing this class.

## Data types

To improve efficiency, the data type used are byte and boolean. You cannot change the character's values once defined, and here are the indexes used in the class.

### Game

- `isGenshin`: A boolean value that indicates whether the character belongs to the Genshin Impact game or not.
    - true: Genshin Impact
    - false: Honkai: Star Rail

### Weapon

- `weaponIndex`: A byte value that represents the weapon type of the character. The available options are:
  - 0: Sword
  - 1: Bow
  - 2: Catalyst
  - 3: Polearm
  - 4: Claymore

### Element

- `elementIndex`: A byte value that represents the element type of the character. The available options are:
    - if `isGenshin` is `true`:
        - 0: Anemo
        - 1: Geo
        - 2: Electro
        - 3: Dendro
        - 4: Hydro
        - 5: Pyro
        - 6: Cryo
    - else if `isGenshin` is `false`, then the elements belong to Honkai: Star Rail's.
        - 0: Wind
        - 1: Physical
        - 2: Lightning
        - 3: Imaginary
        - 4: Quantum
        - 5: Fire
        - 6: Ice

### Gender

- `isMale`: A boolean value that represents the gender of the character. The available options are:
  - true: Male
  - false: Female

## Usage

To use the `HoyoChars` class, you need to import it into your code and create an instance of the class. 

The structure of the `HoyoChars` object is:

```java
HoyoChars(String charName, byte charElement, byte charWeapon, boolean charIsMale, boolean charIsGenshin)
```

## Example

Here is an example code to implement the HoyoChars class. The class's source code also has an example in the comments.

```java
import HoyoChars;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the HoyoChars class
        HoyoChars Furina = new HoyoChars("Furina", (byte)4, (byte)0, false, true);

        // Print the character's details
        System.out.println(Furina.toString());
    }
}
```

## Limitations
 Due to the fact that in Honkai: Star Rail, the characters do not wield a weapon (in the gameplay sense), they have light cones instead, so when `.toString` is invoked, it will display "a great potential" instead. However, when `.getWeapon` is invoked, it will display "Light Cone" instead.