package com.jinju.Ramyun.recipe.controller;

import com.jinju.Ramyun.recipe.model.RecipeDTO;
import com.jinju.Ramyun.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class RecipeController {

    @Autowired
    RecipeService recipeService;

    //view를 보여주는 API
    @RequestMapping("ramyum/recipe")
    public String recipeView() {
//        List<RecipeDTO> list = mainService.getBoardList();
//        System.out.println("리스트 출력되나?"+list+"리스트 출력");
//        for(RecipeDTO data : list) {
//            System.out.println(data.toString());
//        }
        return "recipe";
    }

    //데이터를 보내주는 API
    @RequestMapping("ramyum/recipeBoard")
    @ResponseBody
    public ModelMap recipeSelect() {
        ModelMap modelMap = new ModelMap();
        List<RecipeDTO> selectList = recipeService.recipeList();

        for(RecipeDTO data : selectList) {
            System.out.println("레시피 데이터 확인");
            System.out.println(data.toString());
        }
        modelMap.put("list",selectList);
        return modelMap;
    }

}
