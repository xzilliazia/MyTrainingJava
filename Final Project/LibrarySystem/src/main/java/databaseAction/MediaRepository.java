package databaseAction;
import java.sql.*;
import java.util.Map;

import actions.*;
import masterClass.*;

import java.util.HashMap;

public class MediaRepository implements Repository<Media> {
    private Map<Integer, Media> mediaDatabase = new HashMap<>();

    @Override
    public void save(Media media) {
        mediaDatabase.put(media.getId(), media);
        System.out.println("Media: "+ media.getTitle() + "berhasil disimpan");
    }
    @Override
    public void remove(Media media) {
        mediaDatabase.remove(media.getId(), media);
        System.out.println("Media: "+ media.getTitle() + "berhasil dihapus");
    }
    @Override
    public void update(Media media) {
        mediaDatabase.put(media.getId(), media);
        System.out.println("Media: "+ media.getTitle() + "berhasil diperbarui");
    }
    @Override
    public Media find(int id) {
        return mediaDatabase.get(id);
    }
}
