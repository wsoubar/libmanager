package br.com.bradseg.coti.libmanager.samples;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectToJsonFile {
    public static void main(String[] args) {
        System.out.println("inicio");
        Artist artist = new Artist();
        artist.setId(3L);
        artist.setName("333 The Beatles");

        ObjectMapper mapper = new ObjectMapper();

        File file = new File("c:/dev/java/artist.json");
        try {
            // Serialize Java object info JSON file.
            mapper.writeValue(file, artist);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // Deserialize JSON file into Java object.
            Artist newArtist = mapper.readValue(file, Artist.class);
            System.out.println("newArtist.getId() = " + newArtist.getId());
            System.out.println("newArtist.getName() = " + newArtist.getName());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}