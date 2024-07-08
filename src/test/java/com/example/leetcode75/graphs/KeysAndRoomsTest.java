package com.example.leetcode75.graphs;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class KeysAndRoomsTest {

    @Test
    void canVisitAllRoomsExample1() {
        KeysAndRooms keysAndRooms = new KeysAndRooms();
        assertThat(keysAndRooms.canVisitAllRooms(List.of(List.of(1), List.of(2), List.of(3), Collections.emptyList()))).isEqualTo(true);
    }

    @Test
    void canVisitAllRoomsExample2() {
        KeysAndRooms keysAndRooms = new KeysAndRooms();
        assertThat(keysAndRooms.canVisitAllRooms(List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0)))).isEqualTo(false);
    }
}