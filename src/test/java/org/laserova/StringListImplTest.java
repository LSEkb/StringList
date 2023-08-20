package org.laserova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {

    @Test
    void add_sizeLessCapacity_addWithoutGrowCapacity() {

    }

    @Test
    void add_sizeEqualsCapacity_addWithGrowCapacity() {

    }

    @Test
    void addByIndex_indexMoreSize_thrownException(){

    }

    @Test
    void addByIndex_indexNoMoreSize_addAndIncreaseSize(){

    }

    @Test
    void set_indexMoreSize_thrownException(){

    }

    @Test
    void set_indexNoMoreSize_replacedItemsByIndex(){

    }

    @Test
    void removeByItem_noHasItemInStringList_thrownException(){

    }

    @Test
    void removeByItem_haveItemInStringList_deleteAndDecreaseSize(){

    }

    @Test
    void removeByIndex_indexMoreSize_thrownException(){

    }

    @Test
    void removeByIndex_indexNoMoreSize_deleteItemAndDecreaseSize(){

    }

    @Test
    void contains_noHasItemInStringList_returnFalse(){

    }

    @Test
    void contains_haveItemInStringList_returnTrue(){

    }

    @Test
    void indexOf_noHasItemInStringList_return_minus1(){

    }

    @Test
    void indexOf_haveItemInStringList_returnIndex(){

    }

    @Test
    void lastIndexOf_noHasItemInStringList_return_minus1(){

    }

    @Test
    void lastIndexOf_haveItemInStringList_returnIndex(){

    }

    @Test
    void get_indexMoreSize_thrownException(){

    }

    @Test
    void get_indexNoMoreSize_returnItem(){

    }

    @Test
    void equals_otherListIsNull_thrownException(){

    }

    @Test
    void equals_stringListsNotEqualToEachOther_returnFalse(){

    }

    @Test
    void equals_stringListsEqualToEachOther_returnTrue(){

    }

    @Test
    void size__returnedSizeIsCorrect(){

    }

    @Test
    void isEmpty_stringListIsEmpty_returnTrue(){

    }

    @Test
    void isEmpty_stringListNoEmpty_returnFalse(){

    }

    @Test
    void toArray__returnedArrayIsCorrect(){

    }
}