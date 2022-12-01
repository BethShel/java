package com.task;

import javax.swing.*;
import java.awt.*;

public class Table {
    /**
     * @param elapsedArrayListAdd - время операции Add в ArrayList
     * @param elapsedArrayListGet - время операции Get в ArrayList
     * @param elapsedArrayListDelete - время операции Delete в ArrayList
     * @param elapsedLinkedListAdd - время операции Add в LinkedList
     * @param elapsedLinkedListGet - время операции Get в LinkedList
     * @param elapsedLinkedListDelete - время операции Delete в LinkedList
     */
    public static void createGUI(long elapsedArrayListAdd, long elapsedArrayListGet, long elapsedArrayListDelete, long elapsedLinkedListAdd,
                                 long elapsedLinkedListGet, long elapsedLinkedListDelete) {
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {
                "Array name",
                "Add (нс)",
                "Get (нс)",
                "Delete (нс)"
        };

        String[][] data = {
                {"ArrayList", String.valueOf(elapsedArrayListAdd), String.valueOf(elapsedArrayListGet), String.valueOf(elapsedArrayListDelete)},
                {"LinkedList", String.valueOf(elapsedLinkedListAdd), String.valueOf(elapsedLinkedListGet), String.valueOf(elapsedLinkedListDelete)}
        };

        JTable table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(450, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
