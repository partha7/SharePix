package com.android.bootcamp.sharepix.ui.home.posts

import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import com.android.bootcamp.sharepix.data.model.Post
import com.android.bootcamp.sharepix.ui.base.BaseAdapter

class PostsAdapter(
    parentLifecycle: Lifecycle,
    posts: ArrayList<Post>
) : BaseAdapter<Post, PostItemViewHolder>(parentLifecycle, posts) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PostItemViewHolder(parent)
}