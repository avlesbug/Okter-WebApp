package com.example.Okter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.FirebaseOptions.Builder;

@SpringBootApplication
public class OkterApplication {

	public static void main(String[] args) throws IOException {

		File file = new File(ClassLoader.getSystemResource("serviceAccountKey.json").getFile());
		FileInputStream serviceAccount = 
				new FileInputStream(file.getAbsolutePath());
		
		FirebaseOptions options = new Builder()
			.setCredentials(GoogleCredentials.fromStream(serviceAccount))
			.setDatabaseUrl("https://okter-7f509-default-rtdb.europe-west1.firebasedatabase.app")
			.build();
			  
		FirebaseApp.initializeApp(options);

		SpringApplication.run(OkterApplication.class, args);
	}

}
