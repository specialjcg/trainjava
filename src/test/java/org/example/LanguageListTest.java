package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanguageListTest {

    @Test
    @Tag("task:1")
    @DisplayName("The isEmpty method returns true when the list contains no languages")
    public void empty() {
        LanguageList languageList = new LanguageList();
        assertTrue(languageList.isEmpty());
    }
    @Test
    @Tag("task:2")
    @DisplayName("The isEmpty method returns false after adding a language to the list")
    public void nonEmpty() {
        LanguageList languageList = new LanguageList();

        languageList.addLanguage("Java");
        assertFalse(languageList.isEmpty());
    }
    @Test
    @Tag("task:3")
    @DisplayName("The removeLanguage method correctly removes a language from the list")
    public void removeLanguage() {
        LanguageList languageList = new LanguageList();

        languageList.addLanguage("Java");
        languageList.removeLanguage("Java");
        assertTrue(languageList.isEmpty());
    }
    @Test
    @Tag("task:4")
    @DisplayName("The firstLanguage method returns the first language that was added to the list")
    public void firstLanguage() {
        LanguageList languageList = new LanguageList();

        languageList.addLanguage("Java");
        languageList.addLanguage("Python");
        languageList.addLanguage("Ruby");
        assertEquals("Java", languageList.firstLanguage());
    }
    @Test
    @Tag("task:5")
    @DisplayName("The count method returns 0 when the list is empty")
    public void countEmpty() {
        LanguageList languageList = new LanguageList();

        assertEquals(0, languageList.count());
    }
    @Test
    @Tag("task:5")
    @DisplayName("The count method returns the number of languages in the list")
    public void countThree() {
        LanguageList languageList = new LanguageList();

        languageList.addLanguage("Java");
        languageList.addLanguage("Python");
        languageList.addLanguage("Ruby");
        assertEquals(3, languageList.count());
    }
    @Test
    @Tag("task:6")
    @DisplayName("The containsLanguage method returns true when the language is in the list")
    public void containsLanguage() {
        LanguageList languageList = new LanguageList();
        languageList.addLanguage("Java");
        assertTrue(languageList.containsLanguage("Java"));
    }
    @Test
    @Tag("task:6")
    @DisplayName("The containsLanguage method returns false when the language is not in the list")
    public void doesNotContainLanguage() {
        LanguageList languageList = new LanguageList();

        languageList.addLanguage("Kotlin");
        assertFalse(languageList.containsLanguage("Java"));
    }
    @Test
    @Tag("task:7")
    @DisplayName("The isExciting method returns true when the list contains Kotlin")
    public void excitingLanguageListWithKotlin() {
        LanguageList languageList = new LanguageList();
        languageList.addLanguage("Python");
        languageList.addLanguage("Kotlin");
        assertTrue(languageList.isExciting());
    }
    @Test
    @Tag("task:7")
    @DisplayName("The isExciting method returns false when the list contains neither Java nor Kotlin")
    public void boringLanguageList() {
        LanguageList languageList = new LanguageList();

        languageList.addLanguage("Python");
        languageList.addLanguage("Ruby");
        languageList.addLanguage("C++");
        assertFalse(languageList.isExciting());
    }
    @Test
    @Tag("task:7")
    @DisplayName("The isExciting method returns true when the list contains Java")
    public void excitingLanguageListWithJava() {
        LanguageList languageList = new LanguageList();

        languageList.addLanguage("Java");
        assertTrue(languageList.isExciting());
    }

}