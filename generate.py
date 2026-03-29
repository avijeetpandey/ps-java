import os
import re

# Your specified base directory
BASE_DIR = "/Users/avijeet.pandey/dev/ps-java/src/neetcode/amazon_prep"

# Dictionary grouping the 100 problems by topic
CATEGORIES = {
    "ArraysAndStrings": [
        "Two Sum", "3Sum", "Container With Most Water", "Product of Array Except Self", 
        "String to Integer (atoi)", "Reorder Data in Log Files", "Group Anagrams", 
        "Minimum Size Subarray Sum", "Find All Anagrams in a String", "Search in Rotated Sorted Array",
        "Find Minimum in Rotated Sorted Array", "Spiral Matrix", "Set Matrix Zeroes", "Rotate Image"
    ],
    "SlidingWindow_TwoPointers": [
        "Trapping Rain Water", "Longest Substring Without Repeating Characters", "Minimum Window Substring",
        "Longest Palindromic Substring", "Sliding Window Maximum", "Longest Repeating Character Replacement"
    ],
    "LinkedLists": [
        "Reverse Linked List", "Merge Two Sorted Lists", "Merge k Sorted Lists", 
        "Copy List with Random Pointer", "Add Two Numbers", "Linked List Cycle", "Reverse Nodes in k-Group"
    ],
    "TreesAndTries": [
        "Binary Tree Level Order Traversal", "Lowest Common Ancestor of a Binary Tree", 
        "Binary Tree Maximum Path Sum", "Serialize and Deserialize Binary Tree", "Diameter of Binary Tree",
        "Validate Binary Search Tree", "Implement Trie (Prefix Tree)", "Design Add and Search Words Data Structure",
        "Maximum Depth of Binary Tree", "Same Tree", "Invert Binary Tree", "Binary Tree Right Side View",
        "Construct Binary Tree from Preorder and Inorder Traversal", "Kth Smallest Element in a BST", 
        "Lowest Common Ancestor of a Binary Search Tree"
    ],
    "GraphsAndSearch": [
        "Number of Islands", "Rotting Oranges", "Word Ladder", "Course Schedule", "Course Schedule II",
        "Word Search", "Word Search II", "Pacific Atlantic Water Flow", "Surrounded Regions", 
        "Walls and Gates", "Snakes and Ladders", "Min Cost to Connect All Points", "Network Delay Time",
        "Cheapest Flights Within K Stops", "Alien Dictionary", "Graph Valid Tree", 
        "Number of Connected Components in an Undirected Graph", "Redundant Connection"
    ],
    "HeapsAndQueues": [
        "Top K Frequent Elements", "K Closest Points to Origin", "Top K Frequent Words", 
        "Find Median from Data Stream", "Task Scheduler", "Minimum Cost to Connect Sticks",
        "Kth Largest Element in an Array"
    ],
    "DynamicProgramming": [
        "Best Time to Buy and Sell Stock", "Maximum Subarray", "Coin Change", "Climbing Stairs", 
        "Word Break", "Decode Ways", "House Robber", "House Robber II", "Palindromic Substrings",
        "Longest Increasing Subsequence", "Longest Common Subsequence", "Edit Distance"
    ],
    "Intervals": [
        "Merge Intervals", "Meeting Rooms II", "Insert Interval", "Non-overlapping Intervals"
    ],
    "Backtracking": [
        "Generate Parentheses", "Permutations", "Subsets", "Combination Sum", 
        "Letter Combinations of a Phone Number"
    ],
    "DesignAndMisc": [
        "Valid Parentheses", "LRU Cache", "LFU Cache", "Design Tic-Tac-Toe", 
        "Design Search Autocomplete System", "Koko Eating Bananas", "Time Based Key-Value Store",
        "Daily Temperatures", "Car Fleet", "Largest Rectangle in Histogram", 
        "Evaluate Reverse Polish Notation", "Implement Rand10() Using Rand7()"
    ]
}

def clean_class_name(name):
    """Converts 'Two Sum' to 'TwoSum' (PascalCase)"""
    clean_name = re.sub(r'[^a-zA-Z0-9\s]', '', name)
    return "".join(word.capitalize() for word in clean_name.split())

def clean_method_name(name):
    """Converts 'Two Sum' to 'twoSum' (camelCase)"""
    clean_name = re.sub(r'[^a-zA-Z0-9\s]', '', name)
    words = clean_name.split()
    if not words:
        return "solve"
    # First word lowercase, rest capitalized
    return words[0].lower() + "".join(word.capitalize() for word in words[1:])

def generate_template(problem_name, class_name, method_name):
    """Generates the Java file content with dynamic method names"""
    return f"""// Problem: {problem_name}

public class {class_name} {{

    public static void {method_name}() {{
        // TODO: Implement {problem_name} logic here
    }}

    public static void main(String[] args) {{
        System.out.println("Executing: {problem_name}");
        {method_name}();
    }}
}}
"""

def create_files():
    for category, problems in CATEGORIES.items():
        category_dir = os.path.join(BASE_DIR, category)
        
        # Create category folder
        os.makedirs(category_dir, exist_ok=True)
        
        for problem in problems:
            class_name = clean_class_name(problem)
            method_name = clean_method_name(problem)
            file_path = os.path.join(category_dir, f"{class_name}.java")
            
            # Write the Java template
            with open(file_path, "w") as f:
                f.write(generate_template(problem, class_name, method_name))
            
            print(f"Created: {category}/{class_name}.java")

if __name__ == "__main__":
    print(f"Generating files in {BASE_DIR}...")
    create_files()
    print("✅ Successfully created all folders and Java files!")