class Solution {
public:
    bool validateStackSequences(vector<int>& pushed, vector<int>& popped) {
        stack<int> st;
        int j=0;
        for(int i=0;i<popped.size();i++){
            st.push(pushed[i]);
            while(!st.empty()&&popped[j]==st.top()){
                st.pop();
                j++;
            }
        }
        return st.empty();
    }
};
