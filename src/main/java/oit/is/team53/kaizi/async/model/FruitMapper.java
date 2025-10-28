package oit.is.team53.kaizi.async.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface FruitMapper {

    @Select("SELECT * FROM FRUIT;")
    ArrayList<Fruit> selectAllFruit();

    @Select("SELECT * FROM FRUIT WHERE id = #{id};")
    Fruit selectFruitById(int id);

    @Delete("DELETE FROM FRUIT WHERE id = #{id};")
    Boolean deleteFruitById(int id);

    @Update("UPDATE FRUIT SET name = #{name}, price = #{price} WHERE id = #{id};")
    Boolean updateFruitById(Fruit fruit);

}
