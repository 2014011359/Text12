package cn.edu.bistu.cs.se.text12.Words;

import android.app.FragmentManager;
import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.edu.bistu.cs.se.text12.DetailFragment;
import cn.edu.bistu.cs.se.text12.R;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class WordsContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<WordItem> ITEMS = new ArrayList<WordItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, WordItem> ITEM_MAP = new HashMap<String, WordItem>();

    private static final int COUNT = 25;

    static {
        addItem(new WordItem("1", "Apple", "Apple"));
        addItem(new WordItem ("2", "Orange", " Orange "));
        addItem(new WordItem ("3", "Banana", " Banana "));
        addItem(new WordItem ("4", "Lemon", " Lemon "));
    }


    private static void addItem(WordItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static WordItem createDummyItem(int position) {
        return new WordItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }




    public static class WordItem {
        public final String id;
        public final String content;
        public final String details;

        public WordItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }





}
