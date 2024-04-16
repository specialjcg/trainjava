package org.example;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class GottaSnatchEmAll {
static List<String> cardsGotta;
    static Set<String> newCollection(List<String> cards) {
        cardsGotta = cards;
        return cardsGotta.stream().collect(Collectors.toSet());    }

    static boolean addCard(String card, Set<String> collection) {
return collection.add(card);    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
return !(myCollection.isEmpty() || theirCollection.isEmpty());    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>(collections.get(0));
        for (Set<String> collection : collections) {
            common.retainAll(collection);
        }
        return common;    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>();
        for (Set<String> collection : collections) {
            allCards.addAll(collection);
        }
        return allCards;    }
}

