class AddColumnsToStories < ActiveRecord::Migration
  def change
    change_table :stories do |t|
      t.string :title
      t.date :story_date
    end
  end
end
