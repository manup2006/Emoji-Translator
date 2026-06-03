package com.example.emojitranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    EditText inputText;
    TextView outputText;

    HashMap<String, String> emojiMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputText);
        outputText = findViewById(R.id.outputText);

        emojiMap = new HashMap<>();

        emojiMap = new HashMap<>();

        // Emotions
        emojiMap.put("happy", "😊");
        emojiMap.put("sad", "😢");
        emojiMap.put("angry", "😠");
        emojiMap.put("love", "❤️");
        emojiMap.put("laugh", "😂");
        emojiMap.put("cry", "😭");
        emojiMap.put("kiss", "😘");
        emojiMap.put("cool", "😎");
        emojiMap.put("thinking", "🤔");
        emojiMap.put("sleep", "😴");

        // Gestures
        emojiMap.put("thumbs-up", "👍");
        emojiMap.put("thumbs-down", "👎");
        emojiMap.put("clap", "👏");
        emojiMap.put("wave", "👋");
        emojiMap.put("ok", "👌");
        emojiMap.put("pray", "🙏");
        emojiMap.put("victory", "✌️");
        emojiMap.put("muscle", "💪");

        // Animals
        emojiMap.put("dog", "🐶");
        emojiMap.put("cat", "🐱");
        emojiMap.put("lion", "🦁");
        emojiMap.put("tiger", "🐯");
        emojiMap.put("monkey", "🐵");
        emojiMap.put("elephant", "🐘");
        emojiMap.put("horse", "🐴");
        emojiMap.put("rabbit", "🐰");
        emojiMap.put("bird", "🐦");
        emojiMap.put("fish", "🐟");

        // Food
        emojiMap.put("burger", "🍔");
        emojiMap.put("pizza", "🍕");
        emojiMap.put("cake", "🎂");
        emojiMap.put("ice-cream", "🍦");
        emojiMap.put("coffee", "☕");
        emojiMap.put("tea", "🍵");
        emojiMap.put("apple", "🍎");
        emojiMap.put("banana", "🍌");
        emojiMap.put("grapes", "🍇");

        // Travel
        emojiMap.put("car", "🚗");
        emojiMap.put("bike", "🏍️");
        emojiMap.put("bus", "🚌");
        emojiMap.put("train", "🚆");
        emojiMap.put("plane", "✈️");
        emojiMap.put("ship", "🚢");
        emojiMap.put("rocket", "🚀");

        // Nature
        emojiMap.put("sun", "☀️");
        emojiMap.put("moon", "🌙");
        emojiMap.put("star", "⭐");
        emojiMap.put("cloud", "☁️");
        emojiMap.put("rain", "🌧️");
        emojiMap.put("snow", "❄️");
        emojiMap.put("fire", "🔥");
        emojiMap.put("tree", "🌳");
        emojiMap.put("flower", "🌸");

        // Sports
        emojiMap.put("football", "⚽");
        emojiMap.put("cricket", "🏏");
        emojiMap.put("basketball", "🏀");
        emojiMap.put("tennis", "🎾");
        emojiMap.put("trophy", "🏆");
        emojiMap.put("medal", "🥇");

        // Objects
        emojiMap.put("phone", "📱");
        emojiMap.put("laptop", "💻");
        emojiMap.put("book", "📚");
        emojiMap.put("camera", "📷");
        emojiMap.put("clock", "⏰");
        emojiMap.put("gift", "🎁");
        emojiMap.put("money", "💰");

        // Symbols
        emojiMap.put("heart", "❤️");
        emojiMap.put("broken heart", "💔");
        emojiMap.put("check", "✔️");
        emojiMap.put("cross", "❌");
        emojiMap.put("warning", "⚠️");
        emojiMap.put("bright star", "🌟");

        // Celebrations
        emojiMap.put("party", "🎉");
        emojiMap.put("balloon", "🎈");
        emojiMap.put("confetti", "🎊");
        emojiMap.put("birthday", "🎂");
        emojiMap.put("Christmas", "🎄");
        emojiMap.put("new year", "🎆");

        inputText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                translateText(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    private void translateText(String text) {

        String[] words = text.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : words) {
            if(emojiMap.containsKey(word)) {
                result.append(emojiMap.get(word)).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        outputText.setText(result.toString());
    }
}