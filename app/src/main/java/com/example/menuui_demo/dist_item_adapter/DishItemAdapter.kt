package com.example.menuui_demo.dist_item_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.menuui_demo.R
import com.example.menuui_demo.data.DishItem
import com.example.menuui_demo.databinding.DishItemBinding

class DishItemAdapter(
    var dishes:List<DishItem>
):RecyclerView.Adapter<DishItemAdapter.DishItemViewHolder>() {


    inner class DishItemViewHolder(dishItemView: View) : RecyclerView.ViewHolder(dishItemView);
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishItemViewHolder {
//        get the `RecyclerViewItemBinding -> in this case DishItemBinding and inflate the LayoutInflater`
//        LayoutInflater Context -> parent.context
//        LayoutInflater viewGroup -> parent
//        attachToParent -> false

        var item = DishItemBinding.inflate(LayoutInflater.from(parent.context),parent,false).root;
//        Return type should be DishItemViewHolder(item)
        return DishItemViewHolder(item);
    }

    override fun onBindViewHolder(holder: DishItemViewHolder, position: Int) {
//        create DishItemBinding and bind it to the holder... you can access the DishItems(RecyclerViewItems) elements using their id
        DishItemBinding.bind(holder.itemView).apply {
            dishTitle.text = dishes[position].title;
            dishDescription.text = dishes[position].description;
        }
    }

    override fun getItemCount(): Int {
       return dishes.size;
    }
}