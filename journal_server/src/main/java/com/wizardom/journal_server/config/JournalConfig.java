package com.wizardom.journal_server.config;

import com.wizardom.journal_server.model.Journal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Configuration
public class JournalConfig implements CommandLineRunner {

    public static List<Journal> journals = new ArrayList<>();

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < new Random().nextInt(300); i++) {
            journals.add(new Journal()
                    .setDate(Instant.now().minusSeconds(new Random().nextInt(400000)))
                    .setId(i)
                    .setBody("body of Journal for id " + i)
                    .setUserId(String.valueOf(i * 2))
            );
        }
    }
}
