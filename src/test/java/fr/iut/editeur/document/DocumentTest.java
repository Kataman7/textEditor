package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testMethode() {
        Document document = new Document();
        document.setTexte("Hello World");
        assertEquals("Hello World", document.getTexte());
    }
}
