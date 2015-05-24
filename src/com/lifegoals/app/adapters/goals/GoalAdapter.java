package com.lifegoals.app.adapters.goals;

import java.util.List;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.lifegoals.app.R;
import com.lifegoals.app.entities.Goal;
import com.lifegoals.app.entities.SavedGoal;
import com.lifegoals.app.helper.DrawableHelper;

public class GoalAdapter extends RecyclerView.Adapter<GoalViewHolder> {

	private List<Goal> goals;
	private GoalAdapterListener listener;

	public GoalAdapter(List<Goal> goals) {
		super();
		this.goals = goals;
	}

	public GoalAdapter setOnSavedAdapterListener(GoalAdapterListener listener) {
		this.listener = listener;
		return this;
	}

	@Override
	public int getItemCount() {
		if (goals == null)
			return 0;
		return goals.size();
	}

	@Override
	public void onBindViewHolder(GoalViewHolder arg0, int arg1) {
		final Goal goal = goals.get(arg1);
		arg0.goalView.setText(goal.getText());
		arg0.goalView.setColor(goal.getColor());
	}

	@Override
	public GoalViewHolder onCreateViewHolder(ViewGroup arg0, int arg1) {
		View v = LayoutInflater.from(arg0.getContext()).inflate(
				R.layout.item_goal, arg0, false);
		GoalViewHolder vh = new GoalViewHolder(v);
		return vh;
	}

}
