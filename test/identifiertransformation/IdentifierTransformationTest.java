/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identifiertransformation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kc791134
 */
public class IdentifierTransformationTest {
    
@Test
public void testMethode2(){
    String test = IdentifierTransformation.snakeCaseIdentifierToCamelCase("totototo");
    assertEquals("totototo", test);
}

@Test
public void testMethode2Avec_(){
    String test = IdentifierTransformation.snakeCaseIdentifierToCamelCase("to_to_toto");
    assertEquals("toToToto", test);
}

@Test
public void testMethode2AvecEspace(){
    String test = IdentifierTransformation.snakeCaseIdentifierToCamelCase("to to toto");
    assertEquals("to to toto", test);
}

@Test
public void testMethode2SNAKE_CASE(){
    String test = IdentifierTransformation.snakeCaseIdentifierToCamelCase("SNAKE_CASE");
    assertEquals("snakeCase", test);
}

@Test
public void testMethode1SNAKE_CASE(){
    String test = IdentifierTransformation.snakeCaseIdentifierToPascalCase("SNAKE_CASE");
    assertEquals("SnakeCase", test);
}

@Test
public void testMethode2123_456(){
    String test = IdentifierTransformation.snakeCaseIdentifierToCamelCase("123_456");
    assertEquals("123456", test);
}

@Test
public void testMethode1123_456(){
    String test = IdentifierTransformation.snakeCaseIdentifierToPascalCase("123_456");
    assertEquals("123456", test);
}

@Test
public void testMethode2snake_case(){
    String test = IdentifierTransformation.snakeCaseIdentifierToCamelCase("snake_case");
    assertEquals("snakeCase", test);
}

@Test
public void testMethode1snake_case(){
    String test = IdentifierTransformation.snakeCaseIdentifierToPascalCase("snake_case");
    assertEquals("SnakeCase", test);
}

@Test
public void testMethode2snake__case_(){
    String test = IdentifierTransformation.snakeCaseIdentifierToCamelCase("snake__case_");
    assertEquals("snakeCase", test);
}

@Test
public void testMethode1_snake__case_(){
    String test = IdentifierTransformation.snakeCaseIdentifierToPascalCase("_snake__case_");
    assertEquals("SnakeCase", test);
}

@Test
public void testMethode2______(){
    String test = IdentifierTransformation.snakeCaseIdentifierToCamelCase("______");
    assertEquals("", test);
}

@Test
public void testMethode1______(){
    String test = IdentifierTransformation.snakeCaseIdentifierToPascalCase("______");
    assertEquals("", test);
}

@Test
public void testMethode2AvecVide(){
    String test = IdentifierTransformation.snakeCaseIdentifierToCamelCase(" ");
    assertEquals(" ", test);
}

@Test
public void testMethode1AvecVide(){
    String test = IdentifierTransformation.snakeCaseIdentifierToPascalCase(" ");
    assertEquals(" ", test);
}

@Test
public void testMethode2SnakeCase(){
    String test = IdentifierTransformation.snakeCaseIdentifierToCamelCase("Snake-Case");
    assertEquals("snake-case", test);
}

@Test
public void testMethode1SnakeCase(){
    String test = IdentifierTransformation.snakeCaseIdentifierToPascalCase("Snake-Case");
    assertEquals("Snake-case", test);
}

    /**
     * Test of snakeCaseIdentifierToPascalCase method, of class IdentifierTransformation.
     */
    @Test
    public void testSnakeCaseIdentifierToPascalCase() {
        System.out.println("snakeCaseIdentifierToPascalCase");
        String identifier = "";
        String expResult = "";
        String result = IdentifierTransformation.snakeCaseIdentifierToPascalCase(identifier);
        assertEquals(expResult, result);
    }

    /**
     * Test of snakeCaseIdentifierToCamelCase method, of class IdentifierTransformation.
     */
    @Test
    public void testSnakeCaseIdentifierToCamelCase() {
        System.out.println("snakeCaseIdentifierToCamelCase");
        String identifier = "";
        String expResult = "";
        String result = IdentifierTransformation.snakeCaseIdentifierToCamelCase(identifier);
        assertEquals(expResult, result);
    }
    
}
