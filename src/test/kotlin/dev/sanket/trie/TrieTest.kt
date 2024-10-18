package dev.sanket.trie

import assertk.assertThat
import assertk.assertions.isFalse
import assertk.assertions.isTrue
import dev.sanket.dev.sanket.trie.Trie
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class TrieTest {


    @Nested
    inner class Insert {
        private val trie = Trie()

        @Test
        fun shouldInsertNewWord() {
            trie.insert("apple")
        }
    }

    @Nested
    inner class Search {
        private val trie = Trie()

        @ParameterizedTest
        @CsvSource(value = ["apple:apple", "app:app"], delimiter = ':')
        fun shouldReturnTrue(insert: String, search: String) {
            trie.insert(insert)

            assertThat(trie.search(search)).isTrue()
        }

        @ParameterizedTest
        @CsvSource(value = ["apple:apples", "apple:app"], delimiter = ':')
        fun shouldReturnFalse(insert: String, search: String) {
            trie.insert(insert)

            assertThat(trie.search(search)).isFalse()
        }
    }

    @Nested
    inner class StartsWith {
        private val trie = Trie()

        @ParameterizedTest
        @CsvSource(value = ["apple:app", "apple:apple"], delimiter = ':')
        fun shouldReturnTrue(insert: String, search: String) {
            trie.insert(insert)

            assertThat(trie.startsWith(search)).isTrue()
        }

        @ParameterizedTest
        @CsvSource(value = ["apple:appbana"], delimiter = ':')
        fun shouldReturnFalse(insert: String, search: String) {
            trie.insert(insert)

            assertThat(trie.search(search)).isFalse()
        }
    }
}