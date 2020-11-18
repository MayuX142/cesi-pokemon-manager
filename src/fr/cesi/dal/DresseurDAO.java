package fr.cesi.dal;

public class DresseurDAO {
    final static String SQL_INSERT = "INSERT INTO attaque (nom, force) values(?, ?)";
    final static String SQL_SELECT_ALL = "SELECT id, nom, force FROM attaque";
    final static String SQL_DELETE = "DELETE FROM attaque WHERE id=?";
    final static String SQL_UPDATE = "UPDATE attaque SET nom=?, force=? WHERE id=?";


}
