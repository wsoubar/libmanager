package br.com.bradseg.coti.libmanager.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import br.com.bradseg.coti.libmanager.vo.Servidor;

/**
 * ServerDaoImpl
 */
public class ServerDaoImpl {
    private GsonBuilder builder = new GsonBuilder();
    private Gson gson = null;

    public ServerDaoImpl() {
        builder.setPrettyPrinting();
        gson = builder.create();
    }

    public static void main(String[] args) {
        ServerDaoImpl dao = new ServerDaoImpl();
        dao.loadServers();
    }

    private void loadServers() {
        try {

            Servidor[] servidores = gson.fromJson(new FileReader("c:/dev/java/servidores-was.json"), Servidor[].class);
            System.out.println(servidores.length);
            /*
            for (int i = 0; i < servidores.length; i++) {
                System.out.println("id: " + servidores[i].getId());
                System.out.println("servidor: " + servidores[i].getNome());
                System.out.println("descricao: " + servidores[i].getDescricao());
            }
            */
        } catch (JsonSyntaxException | JsonIOException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}