package main;

import main.testcases.*;

/** This is a class used for running some testcases */
public final class Test {
    private Test() {}

    public static void runTestcases() {
         // 1 - TestAddWord
         TestAddWord.testAddWord();

         // 2 - TestRemoveWord
         TestRemoveWord.testRemoveWord();

         // 3 - TestAddDefinitionForWord
         TestAddDefinitionForWord.testAddDefinitionForWord();

         // 4 - TestRemoveDefinitionForWord
         TestRemoveDefinitionForWord.testRemoveDefinitionForWord();

         // 5 - TestTranslateWord
         TestTranslateWord.testTranslateWord();

         // 6 - TestTranslateSentence
         TestTranslateSentence.testTranslateSentence();

         // 7 - TestTranslateSentencesSynonyms
         TestTranslateSentenceSynonyms.testTranslateSentenceSynonyms();

         // 8 - TestGetDefinitionsForWord
         TestGetDefinitionsForWord.testGetDefinitionsForWord();

         // 9 - TestExportDictionary
         TestExportDictionary.testExportDictionary();
    }
}
