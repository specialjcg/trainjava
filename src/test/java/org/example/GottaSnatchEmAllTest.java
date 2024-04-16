package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class GottaSnatchEmAllTest {
    @Test
    @Tag("task:1")
    @DisplayName("newCollection returns an empty set when given an empty list")
    void testNewCollectionEmptyList() {
        assertThat(GottaSnatchEmAll.newCollection(List.of())).isEmpty();
    }
    @Test
    @Tag("task:2")
    @DisplayName("addCard returns true when the collection does not yet contain the new card")
    void testAddCardReturnsTrueWhenCardNotInCollection() {
        Set<String> collection = new HashSet<>();
        assertThat(GottaSnatchEmAll.addCard("Veevee", collection)).isTrue();
    }
    @Test
    @Tag("task:3")
    @DisplayName("canTrade returns false when both collections are empty")
    void testCanTradeBothCollectionsEmpty() {
        Set<String> myCollection = new HashSet<>();
        Set<String> theirCollection = new HashSet<>();
        assertThat(GottaSnatchEmAll.canTrade(myCollection, theirCollection)).isFalse();
    }
    @Test
    @Tag("task:5")
    @DisplayName("allCards returns a set with all cards when given a single collection")
    void testAllCardsSingleCollection() {
        List<Set<String>> collections = List.of(Set.of("Veevee", "Wigglycream", "Mayofried"));
        Set<String> expected = Set.of("Veevee", "Wigglycream", "Mayofried");
        assertThat(GottaSnatchEmAll.allCards(collections)).isEqualTo(expected);
    }
}