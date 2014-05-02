class AddColumnsToStories < ActiveRecord::Migration
  def change
    change_table :stories do |t|
      add_column :title, :string
      add_column :story_date, :date

      add_timestamps
    end

  end
end
