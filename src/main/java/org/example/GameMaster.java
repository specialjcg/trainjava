package org.example;

public class GameMaster {
    public static String describe(Character character) {
        return String.format("You're a level %d %s with %d hit points.",
                             character.getLevel(),
                             character.getCharacterClass(),
                             character.getHitPoints());
    }
public static String describe(Destination destination) {
    return String.format(
                         "You've arrived at %s, which has %d" + " inhabitants.",
                         destination.getName(),
                         destination.getInhabitants());
}
    public static String describe(TravelMethod travelMethod) {
        switch (travelMethod) {
            case WALKING:
                return "You're traveling to your destination by walking.";
            case HORSEBACK:
                return "You're traveling to your destination on horseback.";
            default:
                return "Unknown travel method.";
        }
    }

    public static String describe(Character character, Destination destination) {
        String characterDescription = describe(character);
        String destinationDescription = describe(destination);

        return characterDescription + " You're traveling to your destination by walking. "  + destinationDescription;
    }

    public static String describe(Character character, Destination destination, TravelMethod travelMethod) {
        String characterDescription = describe(character);
        String destinationDescription = describe(destination);
        String travelMethodDescription = describe(travelMethod);
        return characterDescription +  " " + travelMethodDescription+" " + destinationDescription ;
    }}
