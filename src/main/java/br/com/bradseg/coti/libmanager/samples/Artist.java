package br.com.bradseg.coti.libmanager.samples;

/**
 * Artist
 */
public class Artist {

    private Long id;
    private String name;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}