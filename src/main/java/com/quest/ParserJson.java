package com.quest;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Map;

public class ParserJson {
    class Situation {
        public String question;
        public String answer1;
        public int next_scene1;
        public String answer2;
        public int next_scene2;
    }

    Map<String, Situation> situations;

    public void init(String fileName) {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            FileReader file = new FileReader(classLoader.getResource(fileName).getFile());
            Gson gson = new Gson();
            Type type = new TypeToken<Map<String, Situation>>() {
            }.getType();
            situations = gson.fromJson(file, type);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public String getQuestion(String id) {
        return situations.get(id).question;
    }

    public String getFirstAnswer(String id) {
        return situations.get(id).answer1;
    }

    public String getSecondAnswer(String id) {
        return situations.get(id).answer2;
    }

    public int getNextFirstScene(String id) {

        return situations.get(id).next_scene1;
    }

    public int getNextSecondScene(String id) {

        return situations.get(id).next_scene2;
    }
}
