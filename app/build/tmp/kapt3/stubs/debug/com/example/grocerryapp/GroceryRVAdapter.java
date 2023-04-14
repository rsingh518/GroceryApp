package com.example.grocerryapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/example/grocerryapp/GroceryRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/grocerryapp/GroceryRVAdapter$GroceryViewHolder;", "list", "", "Lcom/example/grocerryapp/GroceryItems;", "groceryItemClickInterface", "Lcom/example/grocerryapp/GroceryRVAdapter$GroceryItemClickInterface;", "(Ljava/util/List;Lcom/example/grocerryapp/GroceryRVAdapter$GroceryItemClickInterface;)V", "getGroceryItemClickInterface", "()Lcom/example/grocerryapp/GroceryRVAdapter$GroceryItemClickInterface;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "GroceryItemClickInterface", "GroceryViewHolder", "app_debug"})
public final class GroceryRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.grocerryapp.GroceryRVAdapter.GroceryViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.grocerryapp.GroceryItems> list;
    @org.jetbrains.annotations.NotNull()
    private final com.example.grocerryapp.GroceryRVAdapter.GroceryItemClickInterface groceryItemClickInterface = null;
    
    public GroceryRVAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.grocerryapp.GroceryItems> list, @org.jetbrains.annotations.NotNull()
    com.example.grocerryapp.GroceryRVAdapter.GroceryItemClickInterface groceryItemClickInterface) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.grocerryapp.GroceryItems> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.grocerryapp.GroceryItems> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.grocerryapp.GroceryRVAdapter.GroceryItemClickInterface getGroceryItemClickInterface() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.grocerryapp.GroceryRVAdapter.GroceryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.grocerryapp.GroceryRVAdapter.GroceryViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/example/grocerryapp/GroceryRVAdapter$GroceryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/grocerryapp/GroceryRVAdapter;Landroid/view/View;)V", "amountTV", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getAmountTV", "()Landroid/widget/TextView;", "deleteTV", "Landroid/widget/ImageView;", "getDeleteTV", "()Landroid/widget/ImageView;", "nameTV", "getNameTV", "quantityTV", "getQuantityTV", "rateTV", "getRateTV", "app_debug"})
    public final class GroceryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView nameTV = null;
        private final android.widget.TextView quantityTV = null;
        private final android.widget.TextView rateTV = null;
        private final android.widget.TextView amountTV = null;
        private final android.widget.ImageView deleteTV = null;
        
        public GroceryViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final android.widget.TextView getNameTV() {
            return null;
        }
        
        public final android.widget.TextView getQuantityTV() {
            return null;
        }
        
        public final android.widget.TextView getRateTV() {
            return null;
        }
        
        public final android.widget.TextView getAmountTV() {
            return null;
        }
        
        public final android.widget.ImageView getDeleteTV() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/grocerryapp/GroceryRVAdapter$GroceryItemClickInterface;", "", "onItemClick", "", "groceryItems", "Lcom/example/grocerryapp/GroceryItems;", "app_debug"})
    public static abstract interface GroceryItemClickInterface {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.example.grocerryapp.GroceryItems groceryItems);
    }
}