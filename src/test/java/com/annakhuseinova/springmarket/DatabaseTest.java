package com.annakhuseinova.springmarket;

import com.annakhuseinova.springmarket.test.Item;
import com.annakhuseinova.springmarket.test.ItemRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@PropertySource("/database.properties")
@TestPropertySource("/database.properties")
public class DatabaseTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void givenGenericEntityRepository_whenSaveAndRetrieveEntity_thenOK() {

        Item item = new Item();
        item.setId(0L);
        item.setTitle("Java");

        Item savedItem = itemRepository.save(item);
        System.out.println(savedItem);
        Assert.assertNotNull(savedItem);
    }
}
